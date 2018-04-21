package ncu.study.autopaper.common.util;

import com.alibaba.druid.filter.config.ConfigTools;
import com.google.common.base.Charsets;
import com.hsjry.lang.log.TenantLog;
import com.jcraft.jsch.*;
import com.jcraft.jsch.ChannelSftp.LsEntry;

import java.io.*;
import java.util.Properties;
import java.util.Vector;

/**
 * SFTP服务器文件操作接口
 *
 * @author Ridup
 * @version $Id: SFTPUploadFileCore.java, v 0.1 Nov 22, 2017 6:55:24 PM Ridup Exp $
 */
public class SftpHandlerFileUtil {

    private TenantLog logger = TenantLog.get(getClass());

    private Session sshSession;

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /** FTP服务器IP地址 */
    private String ftpIp;

    /** FTP服务器存在文件路径 */
    private String serverFilePath;

    /** 本地存放文件路径 */
    private String localFilePath;

    /** 端口号 默认为:22 */
    private int port = 22;

    /** 上传的临时文件的后缀 */
    private String afterfix = ".temp";

    private ChannelSftp sftpClient = null;

    /** 获取文件重试次数 */
    private int errorTimes = 3;

    /** 获取文件 间隔时间单位:毫秒 */
    private Long waitTime = 60000L;

    public SftpHandlerFileUtil(String ftpIp, int port, String userName, String password,
                               String serverFilePath, String localFilePath) {
        this.userName = userName;
        this.password = password;
        this.ftpIp = ftpIp;
        this.serverFilePath = serverFilePath;
        this.port = port;
        this.localFilePath = localFilePath;
    }

    public SftpHandlerFileUtil() {
    }

    /**
     * 连接ftp获取ChannelSftp
     */
    private ChannelSftp connectFtpServer() throws IOException {
        ChannelSftp sftp;
        try {
            JSch jsch = new JSch();
            jsch.getSession(userName, ftpIp, port);
            sshSession = jsch.getSession(userName, ftpIp, port);
            logger.debug("Session created.");
            // 密码进行解密，如果需要，可以执行当前类中的main方法进行密码的加密
            String pwd = ConfigTools.decrypt(password);
            sshSession.setPassword(pwd);
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);
            logger.debug("Session connected before");
            sshSession.connect(5000);
            logger.debug("Session connected.");
            logger.debug("Opening Channel.");
            Channel channel = sshSession.openChannel("sftp");
            channel.connect();
            sftp = (ChannelSftp) channel;
            logger.debug("连接SFTP服务器 " + ftpIp + "成功.");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
        this.sftpClient = sftp;
        try {
            sftpClient.setFilenameEncoding(Charsets.UTF_8.displayName());
        } catch (SftpException e) {
            e.printStackTrace();
        }
        return sftp;
    }

    /**
     * 断开与对方FTP Server的连接
     */
    private void disconnectFtpServer() {
        try {
            if (sftpClient != null) {
                sftpClient.disconnect();
            }
            if (sshSession != null) {
                sshSession.disconnect();
            }
        } catch (Exception e) {
            logger.error("断开SFTP服务器失败", e);
        }
    }

    /**
     * 进入文件目录
     */
    public boolean changeWorkingDirectory(String fileDir) {
        try {
            if (fileDir.trim().length() > 0) {
                sftpClient.cd(fileDir);
            } else {
                sftpClient.cd(sftpClient.getHome());
            }
            return true;
        } catch (SftpException e) {
            if(ChannelSftp.SSH_FX_NO_SUCH_FILE == e.id){
                try {
                    sftpClient.mkdir(fileDir);
                    sftpClient.cd(fileDir);
                } catch (SftpException e1) {
                    logger.error("", e); 
                    return false;
                }
                return true;
            }
            else {
                logger.error(e.getMessage(), e);
                return false;
            }
            
        }
    }

    /**
     * 获取文件InputStream字节流
     */
    public InputStream getInputStream(String fileName) {
        InputStream in;
        for (int i = 0; i < errorTimes; i++) {
            try {
                // 连接FTP服务器
                connectFtpServer();
                // 进入FTP服务器指定目录
                changeWorkingDirectory(serverFilePath);
                in = sftpClient.get(fileName);
                return in;
            } catch (Exception e) {
                logger.error("下载sftp文件异常", e);
            } finally {
                disconnectFtpServer();
            }
            try {
                Thread.sleep(this.waitTime);
            } catch (InterruptedException e) {
                logger.error("休眠失败,线程已中断", e);
            }
        }
        return null;
    }

    /**
     * 获取文件byte数组
     */
    public byte[] getFileBytes(String fileName) {
        InputStream fis = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            // 连接FTP服务器
            connectFtpServer();
            // 进入FTP服务器指定目录
            changeWorkingDirectory(serverFilePath);
            fis = sftpClient.get(fileName);
            
            int bufSize = 1024* 256;
            byte[] buffer = new byte[bufSize];
            int len = 0; 
            if (fis != null) {
                while (-1 != (len = fis.read(buffer, 0, bufSize))) {
                    bos.write(buffer, 0, len);  
                }  
            }
            
            fis.close();
            return bos.toByteArray();
        } catch (SftpException e) {
            e.printStackTrace();
            logger.error("获取文件字节流失败：" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("获取文件字节流失败：" + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    disconnectFtpServer();
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.error("FileInputStream 关闭时发生异常：" + e.getMessage());
                }
            }
        }
        return bos.toByteArray();
    }

    /**
     * 
     * 获取文件byte数组
     * @param directory  serverFilePath相对路径
     * @param fileName  文件名
     * @return
     */
    public byte[] getFileBytes(String directory, String fileName) {
        InputStream fis = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            connectFtpServer(); // 连接FTP服务器
            changeWorkingDirectory(directory); // 进入FTP服务器指定目录
            fis = sftpClient.get(fileName);
            
            int bufSize = 1024* 256;
            byte[] buffer = new byte[bufSize];
            int len = 0; 
            if (fis != null) {
                while (-1 != (len = fis.read(buffer, 0, bufSize))) {
                    bos.write(buffer, 0, len);  
                }  
            }
            
            fis.close();
            return bos.toByteArray();
        } catch (SftpException e) {
            e.printStackTrace();
            logger.error("获取文件字节流失败：" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("获取文件字节流失败：" + e.getMessage());
        } finally {
            try {
                fis.close();
                disconnectFtpServer();
            } catch (IOException e) {
                e.printStackTrace();
                logger.error("FileInputStream 关闭时发生异常：" + e.getMessage());
            }
        }
        return bos.toByteArray();
    }

    /**
    *
    * @param downLoadFileName 需要下载的文件名
    * @param localFileName 保存到本地的文件名
    */
   /*public boolean downLoadFile(String downLoadFileName, String localFileName) throws IOException {
       for (int i = 0; i < errorTimes; i++) {
           logger.debug("开始第" + (i + 1) + "下载;下载的文件名为:" + downLoadFileName + ";本地的文件名为:"
                     + localFileName);
           try {
               connectFtpServer(); // 连接FTP服务器
               changeWorkingDirectory(this.serverFilePath); // 进入FTP服务器指定目录
               String localFilePath = this.localFilePath + File.separator + localFileName;
               File file = new File(localFilePath);
               if (!file.getParentFile().exists()) {
                   file.getParentFile().mkdirs();
               }
               sftpClient.get(downLoadFileName, localFilePath);
               return true;
           } catch (Exception e) {
               logger.error("下载sftp文件异常", e);
           } finally {
               disconnectFtpServer();
           }
           try {
               Thread.sleep(this.waitTime);
           } catch (InterruptedException e) {
               logger.error("休眠失败,线程已中断", e);
           }
       }
       return false;
   }*/
   
    public InputStream downLoadFile(String filePath, String fileName) {
    	InputStream in;
        for (int i = 0; i < errorTimes; i++) {
            try {
                // 连接FTP服务器
                connectFtpServer();
                // 进入FTP服务器指定目录
                changeWorkingDirectory(filePath);
                sftpClient.get(fileName, "./" + fileName);
                in = new FileInputStream(new File("./" + fileName));
                return in;
            } catch (Exception e) {
                logger.error("下载sftp文件异常", e);
            } finally {
                disconnectFtpServer();
            }
            try {
                Thread.sleep(this.waitTime);
            } catch (InterruptedException e) {
                logger.error("休眠失败,线程已中断", e);
            } finally {
                disconnectFtpServer();
            }
        }
        return null;
    	
    }
    /**
     * 下载文件并返回输入流
     */
    public InputStream downLoadFile(String downLoadFileName) {
        return downLoadFile(serverFilePath, downLoadFileName);
    }

    /**
     * 下载文件到本地目录
     */
    public void downLoadFile(String downLoadFileName, OutputStream out) throws IOException {
        // 连接FTP服务器
        connectFtpServer();
        // 进入FTP服务器指定目录
        changeWorkingDirectory(serverFilePath);
        try {
            sftpClient.get(downLoadFileName, out);
        } catch (Exception e) {
            logger.error("下载sftp文件异常", e);
        }
        disconnectFtpServer();
    }

    /**
     * 将byte[]上传到sftp，作为文件。注意:从String生成byte[]是，要指定字符集。
     *
     * @param directory 上传到sftp目录
     * @param sftpFileName 文件在sftp端的命名
     * @param byteArr 要上传的字节数组
     */
    public String upLoadFile(String directory, String sftpFileName, byte[] byteArr) {

        try {
            // 连接FTP服务器
            connectFtpServer();
            // 进入FTP服务器指定目录
            changeWorkingDirectory(directory);
            sftpClient.put(new ByteArrayInputStream(byteArr), sftpFileName);
        } catch (IOException e) {
            logger.error("上传sftp文件异常", e);
        } catch (SftpException e) {
            logger.error("上传sftp文件异常", e);
        }
        return directory + File.separator + sftpFileName;
    }

    /**
     * 将输入流的数据上传到sftp作为文件
     *
     * @param sftpFileName sftp端文件名
     * @param input 输入流
     */
    public String upLoadFile(String sftpFileName, InputStream input) {
        try {
            // 连接FTP服务器
            connectFtpServer();
            // 进入FTP服务器指定目录
            changeWorkingDirectory(serverFilePath);
            sftpClient.put(input, sftpFileName);
        } catch (Exception e) {
            logger.error("上传sftp文件异常", e);
        } finally {
            disconnectFtpServer();
        }
        return serverFilePath + File.separator + sftpFileName;

    }

    /**
     * @param src 原文件
     * @param dirName 文件夹名称
     * @param dest 目标文件名
     */
    public void upLoadFile(String src, String dirName, String dest) throws IOException {
        // 连接FTP服务器
        connectFtpServer();
        try {
            // 进入FTP服务器指定目录
            changeWorkingDirectory(serverFilePath);
            Vector data = sftpClient.ls("./");
            LsEntry record;
            boolean exit = false;
            for (Object obj : data) {
                record = (LsEntry) obj;
                if (record.getAttrs().isDir()) {
                    if (record.getFilename().equals(dirName)) {
                        exit = true;
                        break;
                    }
                }
            }
            if (!exit) {
                sftpClient.mkdir(dirName);
            }
            // 进入FTP服务器指定目录
            changeWorkingDirectory(dirName);
            String tempDest = dest + this.afterfix;
            sftpClient.put(src, tempDest);
            sftpClient.rename(tempDest, dest);
        } catch (Exception e) {
            logger.error("上传sftp文件异常", e);
        } finally {
            disconnectFtpServer();
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAfterfix() {
        return afterfix;
    }

    public void setAfterfix(String afterfix) {
        this.afterfix = afterfix;
    }

    public int getErrorTimes() {
        return errorTimes;
    }

    public void setErrorTimes(int errorTimes) {
        this.errorTimes = errorTimes;
    }

    public Long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
    }

    public String getFtpIp() {
        return ftpIp;
    }

    public void setFtpIp(String ftpIp) {
        this.ftpIp = ftpIp;
    }

    public String getServerFilePath() {
        return serverFilePath;
    }

    public void setServerFilePath(String serverFilePath) {
        this.serverFilePath = serverFilePath;
    }

    public String getLocalFilePath() {
        return localFilePath;
    }

    public void setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(ConfigTools.encrypt("userjbhsftp"));
    }
}
