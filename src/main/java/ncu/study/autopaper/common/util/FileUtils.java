package ncu.study.autopaper.common.util;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * @author Ridup
 * @version FleName:  FileUtils .java  v0.1  2018/5/25 23:00 Exp $
 */
public class FileUtils {
    /**
     *
     * @Title: uploadFile
     * @Description: TODO(上传文件)
     * @param @param request
     * @param @param path
     * @param @return
     * @return Map<String,Object>    返回类型
     * @throws
     */
    public static Map<String, Object> uploadFile(HttpServletRequest request,
                                                 String path) {
        // 获得磁盘文件条目工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // 如果没以下两行设置的话，上传大的文件会占用很多内存，
        // 设置暂时存放的存储室 ,这个存储室,可以和最终存储文件的目录不同
        /**
         * 原理 它是先存到 暂时存储室，然后在真正写到 对应目录的硬盘上， 按理来说 当上传一个文件时，其实是上传了两份，第一个是以 .tmp
         * 格式的 然后再将其真正写到 对应目录的硬盘上
         */
        factory.setRepository(new File(path));
        // 设置 缓存的大小，当上传文件的容量超过该缓存时，直接放到 暂时存储室
        factory.setSizeThreshold(1024 * 1024);

        // 高水平的API文件上传处理
        ServletFileUpload upload = new ServletFileUpload(factory);
        Map<String, Object> returnMap = new HashMap<String, Object>();
        try {
            // 提交上来的信息都在这个list里面
            // 这意味着可以上传多个文件
            // 请自行组织代码
            List<FileItem> list = upload.parseRequest(request);
            // 获取上传的文件
            FileItem item = getUploadFileItem(list);
            String filename = getUploadFileName(item);
            Map<String, String> splitFile = splitFile(filename);
            String oldfilename=splitFile.get("name");
            int count=1;
            while(judeFileExists(path + "\\" + filename)){
                filename=oldfilename+"("+count+")"+splitFile.get("format");
                count++;
            }
            System.out.println("存放目录:" + path);
            System.out.println("文件名:" + filename);
            // 真正写到磁盘上
            item.write(new File(path, filename)); // 第三方提供的
            returnMap.put("state", true);
            returnMap.put("filename", filename);
        } catch (FileUploadException e) {
            returnMap.put("state", false);
        } catch (Exception e) {
            returnMap.put("state", false);
        }
        return returnMap;
    }

    /**
     *
     * @Description: TODO(拆分文件名)
     * @param @param str
     * @param @return    name：文件名称
     * @return Map<String,Object>    返回类型
     * @throws
     */
    public static Map<String, String> splitFile(String str) {
        String name=str.substring(0,str.lastIndexOf("."));
        String format=str.substring(str.lastIndexOf("."),str.length());
        Map<String, String> returnMap =new HashMap<String, String>();
        returnMap.put("name", name);
        returnMap.put("format", format);
        return returnMap;
    }

    /**
     * 获取路径名
     * @Title: getUploadFileName
     * @Description: TODO( 获取路径名)
     * @param @param item
     * @param @return
     * @return String 返回类型
     * @throws
     */
    private static String getUploadFileName(FileItem item) {
        // 获取路径名
        String value = item.getName();
        // 索引到最后一个反斜杠
        int start = value.lastIndexOf("/");
        // 截取 上传文件的 字符串名字，加1是 去掉反斜杠，
        String filename = value.substring(start + 1);

        return filename;
    }

    /**
     * @Title: getUploadFileItem
     * @Description: TODO(获取上传文件)
     * @param @param list
     * @param @return
     * @return FileItem 返回类型
     * @throws
     */
    private static FileItem getUploadFileItem(List<FileItem> list) {
        for (FileItem fileItem : list) {
            if (!fileItem.isFormField()) {
                return fileItem;
            }
        }
        return null;
    }

    /**
     * @Title: creatFile
     * @Description: TODO(创建文件夹)
     * @param @param path
     * @return void 返回类型
     * @throws
     */
    public static void creatFile(String path) {
        File file = new File(path);
        // 如果文件夹不存在则创建
        if (!file.exists() && !file.isDirectory()) {
            System.out.println("//不存在");
            file.mkdir();
        } else {
            System.out.println("//目录存在");
        }
    }

    /**
     *
     * @Title: judeFileExists
     * @Description: TODO(判断文件是否存在)
     * @param @param path
     * @param @return
     * @return boolean    返回类型
     * @throws
     */
    public static boolean judeFileExists(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("文件存在");
            return true;
        } else {
            System.out.println("文件不存在");
            return false;
        }

    }

    /**
     * @Title: deleteFile
     * @Description: TODO(删除单个文件)
     * @param @param sPath
     * @param @return
     * @return boolean    返回类型
     * @throws
     */
    public static boolean deleteFile(String path) {
        File file = new File(path);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            return true;
        }
        return false;
    }
}
