/*
package ncu.study.autopaper.common.util;

import com.aliyun.oss.ClientConfiguration;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSErrorCode;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.ServiceException;
import com.aliyun.oss.model.AbortMultipartUploadRequest;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.ListMultipartUploadsRequest;
import com.aliyun.oss.model.MultipartUpload;
import com.aliyun.oss.model.MultipartUploadListing;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;
import com.hsjry.lang.log.Log;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

*/
/**
 * 该示例代码展示了如何使用OSS的micf上传方式进行多线程分段上传较大文件。
 *
 * 该示例代码执行的过程为： 1. 检查指定的Bucket是否存在，如果不存在则创建它； 2. 根据文件的大小计算应该将文件分成多少个Part进行上传； 3.
 * 初始化micf上传请求； 4. 使用ExecutorService并发在上传每个Part； 5. 如果所有Part均上传成功，则完成这个上传请求； 6.
 * 最后清理掉测试资源：删除上传的Object或未完成的micf上传请求，并删除这个Bucket。
 *
 * 尝试运行这段示例代码时需要注意： 1. 为了展示在删除Bucket时除了需要删除其中的Objects，也需要取消掉未完成的micf uploads，
 * 示例代码最后为删除掉指定的Bucket，因为不要使用您的已经有资源的Bucket进行测试！ 2.
 * 请使用您的API授权密钥填充ACCESS_ID和ACCESS_KEY常量； 3.
 * 需要准确上传用的测试文件，该文件大小要大于一个Part的最小字节数5MB，但不能大于 一个Object允许的最大字节数5GB。
 * 并修改常量UPLOAD_FILE_PATH为测试文件的路径；修改常量DOWNLOAD_FILE_PATH为下载文件的路径。 4.
 * 该程序仅为示例代码，仅供参考，并不能保证足够健壮。
 **//*

public class OSSMultipartUtil {
    private static String ACCESS_ID = "34iTUvMC8fwHYxK8";
    private static String ACCESS_KEY = "s9u4rFv3hDfuIna3mz127pTnpQZyrc";
    private static String DOWNLOAD_FILE_PATH = "d:/hs_sample1.zip";
    private static String OSS_ENDPOINT = "http://oss.aliyuncs.com/";
    protected static Log log = Log.get(OSSMultipartUtil.class);

    public static String performUploadFile(String OSS_ENDPOINT,
                                           String ACCESS_ID, String ACCESS_KEY, String bucketName,
                                           String fileName, long fileLength, byte[] data, String tenantId) {

        ClientConfiguration config = new ClientConfiguration();// 可以使用ClientConfiguration对象设置代理服务器、最大重试次数等参数。
        OSSClient client = new OSSClient(OSS_ENDPOINT, ACCESS_ID, ACCESS_KEY,
                config);
        ensureBucket(client, bucketName.toLowerCase()); // 准备Bucket
        InputStream content;
        content = new ByteArrayInputStream(data);
        ObjectMetadata meta = new ObjectMetadata(); // 创建上传Object的Metadata
        meta.setContentEncoding("UTF-8");
        meta.setContentLength(fileLength); // 必须设置ContentLength
        meta.setContentType(checkFileType(fileName));// 根据不同的文件类型设置不同的http头
        String folderName = "ossfront/";// 文件夹名
        PutObjectResult result = client.putObject(bucketName.toLowerCase(),
                folderName + fileName, content, meta);// 上传Object.
        log.info("上传文件[" + fileName + "]成功：" + result.getETag()); // 打印ETag
        String sURL = generatePresignedUrl(ACCESS_ID, ACCESS_KEY, bucketName,
                fileName, Long.valueOf("3153600000000"));
        if (sURL != null) {
            sURL = "http" + sURL.substring(4);// 将返回的http改成https
            sURL = sURL.replaceAll(
                    "p2p-dp".toLowerCase() + ".oss.aliyuncs.com", tenantId);// 将返回的oss三级通信域名改为oss绑定域名

        }
        return sURL;
    }

    public static String performUploadFile(String fileName, long fileLength,
                                           byte[] data, String realname) {
        String OSS_HEAD = ResourceUtil.getValue("oss.url.head");
        String OSS_ENDPOINT = ResourceUtil.getValue("oss.endpoint");
        String ACCESS_ID = ResourceUtil.getValue("oss.access.id");
        String ACCESS_KEY = ResourceUtil.getValue("oss.access.key");
        String bucketName = ResourceUtil.getValue("oss.bucket.name");
        String EXPIRE_TIME=ResourceUtil.getValue("oss.expire_time");
        ClientConfiguration config = new ClientConfiguration();// 可以使用ClientConfiguration对象设置代理服务器、最大重试次数等参数。
        OSSClient client = new OSSClient(OSS_ENDPOINT, ACCESS_ID, ACCESS_KEY,
                config);
        ensureBucket(client, bucketName.toLowerCase()); // 准备Bucket
        InputStream content;
        content = new ByteArrayInputStream(data);
        ObjectMetadata meta = new ObjectMetadata(); // 创建上传Object的Metadata
        meta.setContentEncoding("UTF-8");
        meta.setContentLength(fileLength); // 必须设置ContentLength
        meta.setContentType(checkFileType(fileName));// 根据不同的文件类型设置不同的http头
        String folderName = "ossfront/";// 文件夹名
        PutObjectResult result = client.putObject(bucketName.toLowerCase(),
                folderName + fileName, content, meta);// 上传Object.
        log.info("上传文件[" + fileName + "]成功：" + result.getETag()); // 打印ETag
        String sURL = generatePresignedUrl(ACCESS_ID, ACCESS_KEY, bucketName,
                fileName, Long.valueOf(EXPIRE_TIME));
        if (sURL != null) {
            sURL = OSS_HEAD + sURL.substring(4);// 将返回的http改成https
            sURL = sURL.replaceAll(
                    bucketName.toLowerCase() + ".oss.aliyuncs.com", realname);// 将返回的oss三级通信域名改为oss绑定域名

        }
        return sURL;
    }

    */
/**
     *
     * @param bucket
     *            篮子名称
     * @param fileName
     *            文件名
     * @param downloadPath
     *            下载路径，例d:temp/ 全路径是downloadPath+fileName
     *//*

    public void performDownloadFile(String bucket, String fileName,
                                    String downloadPath) {

        DOWNLOAD_FILE_PATH = downloadPath;
        ClientConfiguration config = new ClientConfiguration();
        OSSClient client = new OSSClient(OSS_ENDPOINT, ACCESS_ID, ACCESS_KEY,
                config);
        String bucketName = ACCESS_ID.toLowerCase() + "-P2P-" + bucket;
        ensureBucket(client, bucketName); // 准备Bucket
        log.info("OSSmicfUtil  downloading...");
        System.out.println("正在下载," + bucketName + "," + DOWNLOAD_FILE_PATH);
        downloadFile(client, bucketName, fileName, DOWNLOAD_FILE_PATH); // 下载上传完成的Object

    }

    // 创建Bucket
    private static void ensureBucket(OSSClient client, String bucketName)
            throws OSSException, ClientException {

        try {
            // 创建bucket
            client.createBucket(bucketName);
        } catch (ServiceException e) {
            if (!OSSErrorCode.BUCKET_ALREADY_EXISTS.equals(e.getErrorCode())) {
                // 如果Bucket已经存在，则忽略
                throw e;
            }
        }
    }

    // 删除掉Bucket
    public void deleteBucket(String bucketName) throws OSSException,
            ClientException {

        // performInitParam();

        ClientConfiguration config = new ClientConfiguration();
        OSSClient client = new OSSClient(OSS_ENDPOINT, ACCESS_ID, ACCESS_KEY,
                config);

        bucketName = ACCESS_ID.toLowerCase() + "-micf-" + bucketName;

        // 删除bucket之前必须保证bucket为空，所以先必须先删除object和micf

        // 如果存在，查看bucket是否为空
        ObjectListing ObjectListing = client.listObjects(bucketName);
        List<OSSObjectSummary> listDeletes = ObjectListing.getObjectSummaries();
        for (int i = 0; i < listDeletes.size(); i++) {
            String objectName = listDeletes.get(i).getKey();
            // 如果不为空，先删除bucket下的文件
            client.deleteObject(bucketName, objectName);
        }

        // 删除所有未完成的 uploads.
        ListMultipartUploadsRequest listmicfUploadsRequest = new ListMultipartUploadsRequest(
                bucketName);
        MultipartUploadListing uploadListing = client
                .listMultipartUploads(listmicfUploadsRequest);

        for (MultipartUpload upload : uploadListing.getMultipartUploads()) {
            String key = upload.getKey();
            AbortMultipartUploadRequest abortmicfUploadRequest = new AbortMultipartUploadRequest(
                    bucketName, key, upload.getUploadId());

            client.abortMultipartUpload(abortmicfUploadRequest);
        }

        // 删除bucket
        client.deleteBucket(bucketName);
    }

    // 下载Object到本地文件
    private void downloadFile(OSSClient client, String bucketName, String key,
                              String downloadFilePath) throws OSSException, ClientException {
        client.getObject(new GetObjectRequest(bucketName, key), new File(
                downloadFilePath));
    }

    */
/**
     * 生成签名的url，提供给第三方访问
     *
     * @param bucket
     * @param fileName
     * @param expireDate
     *            过期日期，如3600*1000 3600秒=1小时后失效
     *//*

    public static String generatePresignedUrl(String ACCESS_ID,
                                              String ACCESS_KEY, String bucket, String fileName, long expireDate) {

        // performInitParam();

        // bucket = ACCESS_ID.toLowerCase() + "-p2p-"+bucket;
        String folderName = "ossfront/";
        @SuppressWarnings("deprecation")
        OSSClient client = new OSSClient(ACCESS_ID, ACCESS_KEY);
        String url = client.generatePresignedUrl(bucket, folderName + fileName,
                new Date(new Date().getTime() + expireDate)).toString();

        return url;
    }

    @SuppressWarnings("unused")
    private static int calPartCount(long fileLength, long partSize) {
        int partCount = (int) (fileLength / partSize);
        if (fileLength % partSize != 0) {
            partCount++;
        }
        return partCount;
    }

    public static String checkFileType(String fileName) {
        String fileNameToLowerCase = fileName.toLowerCase();
        if (fileNameToLowerCase.endsWith(".jpe")
                || fileNameToLowerCase.endsWith(".jpeg")) {
            return "image/jpeg";
        } else if (fileNameToLowerCase.endsWith(".jpg")) {
            return "image/jpeg";
        } else if (fileNameToLowerCase.endsWith(".png")) {
            return "image/png";
        } else if (fileNameToLowerCase.endsWith(".bmp")) {
            return "application/x-bmp";
        } else if (fileNameToLowerCase.endsWith(".jsp")
                || fileNameToLowerCase.endsWith(".html")
                || fileNameToLowerCase.endsWith(".htm")) {
            return "text/html";
        }
        return "application/octet-stream";
    }

}*/
