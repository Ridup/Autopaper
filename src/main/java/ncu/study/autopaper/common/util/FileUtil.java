package ncu.study.autopaper.common.util;

import java.io.File;

public class FileUtil {

	/**
	 * 文件是否存在
	 * @param filePath
	 * @return
	 */
	public static boolean existsFile(String filePath) {
		File file = new File(filePath);
		return existsFile(file);
	}
	
	/**
	 * 文件是否存在
	 * @param file
	 * @return
	 */
	public static boolean existsFile(File file) {
		return file.exists() && file.isFile();
	}

	/**
	 * 目录是否存在
	 * @param directoryPath
	 * @return
	 */
	public static boolean existsDirectory(String directoryPath) {
		File directory = new File(directoryPath);
		return existsDirectory(directory);
	}
	/**
	 * 目录是否存在
	 * @param directory
	 * @return
	 */
	public static boolean existsDirectory(File directory) {
		return directory.exists() && directory.isDirectory();
	}
	/**
	 * 强制创建目录（包括父级目录）
	 * @param directoryPath
	 * @return 目录已经存在返回true（无论是本来就存在还是成功创建），否则返回false
	 */
	public static boolean forceCreateDirectory(String directoryPath){
		File directory = new File(directoryPath);
		return forceCreateDirectory(directory);
	}
	
	/**
	 * 强制创建目录（包括父级目录）
	 * @param directory
	 * @return 目录已经存在返回true（无论是本来就存在还是成功创建），否则返回false
	 */
	public static boolean forceCreateDirectory(File directory){
		if(existsDirectory(directory)){
			return true;
		}
		return directory.mkdirs();
	}
	
	/**
	 * 获取文件名后缀
	 * @param fileName
	 * @return
	 */
	public static String getFileNameSuffix(String fileName){
		if(fileName == null)
			return "";
		return fileName.substring(fileName.lastIndexOf(".") + 1);
	}
	
//	public static void main(String[] args) {
//		String path = "E:\\upload"+File.separator+"20120101";
//		if(forceCreateDirectory(path)){
//		System.out.println("存在"+path);
//		}
//		System.out.println(File.separator);
//	}
}
