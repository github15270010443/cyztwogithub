package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	// 这个全局变量List很重要，调用完需要置空List
	static List<File> list = new ArrayList<File>();

	/**
	 * 输出打印目录下的包含子目录下的所以文件(不包含子目录名)
	 */
	public static void listDir(File file) {
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files != null && files.length > 0) {
					for (File file2 : files) {
						if (file2.isDirectory()) {
							listDir(file2);
						} else {
							System.out.println(file2.getAbsolutePath());
						}
					}
				}
			} else {
				System.out.println(file.getAbsolutePath());
			}
		} else {
			System.out.println("文件不存在");
		}
	}

	/**
	 * 获取目录下的所有文件(不包含子目录名)
	 */
	public static List<File> getAllFile(File file) {
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files != null && files.length > 0) {
					for (File file2 : files) {
						if (file2.isDirectory()) {
							getAllFile(file2);
						} else {
							list.add(file2);
						}
					}
				}
			}
		} else {
			System.out.println("文件不存在");
		}
		return list;
	}

	/**
	 * 获取目录下的所有文件(包含子目录名)
	 */
	public static List<File> getAllDirAndFile(File file) {
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files != null && files.length > 0) {
					for (File file2 : files) {
						list.add(file2);
						if (file2.isDirectory()) {
							getAllDirAndFile(file2);
						}
					}
				}
			}
		} else {
			System.out.println("文件不存在");
		}
		return list;
	}

	/**
	 * 获取某个目录下的所有一级文件和目录
	 */
	public static List<File> readfile(String filepath) throws FileNotFoundException, IOException {
		List<File> list = new ArrayList<File>();
		File file = new File(filepath);
		if (file.isDirectory()) {
			String[] filelist = file.list();
			for (int i = 0; i < filelist.length; i++) {
				File readfile = new File(filepath + "\\" + filelist[i]);
				list.add(readfile);
			}
		}
		return list;
	}

	/**
	 * 删除文件或者空目录 当Path为文件全路径时可以直接删掉，删除目录， 只能先遍历删除里层的所有子文件才可以删除目录
	 * 
	 * @param path
	 */
	public static void deleteFile(String path) {
		File f = new File(path);
		// f.delete();
		f.deleteOnExit();
	}
	
	/**
	 * 创建文件
	 */
	public static void createFile(String path) {
		File f = new File(path);
		if(f.exists()) {
			System.err.println("文件已存在");
		}else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// listDir(new File("D:\\aa"));
		// readfile("D:\\aa");
		// List<File> list =getAllDirAndFile(new File("D:\\aa"));
		/*
		 * List<File> list =getAllFile(new File("D:\\aa")); for(File f:list) {
		 * System.err.println(f.getAbsolutePath()); }
		 */
		//deleteFile("D:\\cc\\22.txt");
		createFile("D:\\cc\\33.txt");
	}
	

}
