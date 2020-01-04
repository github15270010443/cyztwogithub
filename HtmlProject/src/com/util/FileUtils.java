package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	// ���ȫ�ֱ���List����Ҫ����������Ҫ�ÿ�List
	static List<File> list = new ArrayList<File>();

	/**
	 * �����ӡĿ¼�µİ�����Ŀ¼�µ������ļ�(��������Ŀ¼��)
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
			System.out.println("�ļ�������");
		}
	}

	/**
	 * ��ȡĿ¼�µ������ļ�(��������Ŀ¼��)
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
			System.out.println("�ļ�������");
		}
		return list;
	}

	/**
	 * ��ȡĿ¼�µ������ļ�(������Ŀ¼��)
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
			System.out.println("�ļ�������");
		}
		return list;
	}

	/**
	 * ��ȡĳ��Ŀ¼�µ�����һ���ļ���Ŀ¼
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
	 * ɾ���ļ����߿�Ŀ¼ ��PathΪ�ļ�ȫ·��ʱ����ֱ��ɾ����ɾ��Ŀ¼�� ֻ���ȱ���ɾ�������������ļ��ſ���ɾ��Ŀ¼
	 * 
	 * @param path
	 */
	public static void deleteFile(String path) {
		File f = new File(path);
		// f.delete();
		f.deleteOnExit();
	}
	
	/**
	 * �����ļ�
	 */
	public static void createFile(String path) {
		File f = new File(path);
		if(f.exists()) {
			System.err.println("�ļ��Ѵ���");
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
