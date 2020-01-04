package com.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListUtil {

	/**
	 * List���ϵ����ֱ�����ʽЧ�ʱȽ�  
	 * ���ۣ�ʵ�������������۶��������Զ�������   iterator > foreach > i++
	 * ��������˵�����i++  > foreach  >iterator
	 * i++  һǧ��64000ms
	 * foreach  һǧ��62000ms
	 * iterator  һǧ��60000ms
	 * 
	 * @param args
	 */
	public static void testList() {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}
		// ��ʽ1��i++
//		long startTime = System.currentTimeMillis();
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i);
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("��ʽ1ʱ���:" + (endTime - startTime));
		
		//��ʽ2:foreach
		long startTime2 = System.currentTimeMillis();
		for(Integer i:list) {
			System.out.println(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("��ʽ2ʱ���:" + (endTime2 - startTime2));
		
		//��ʽ3�������� iterator
		long startTime3 = System.currentTimeMillis();
		Iterator<Integer> it= list.iterator();
		while (it.hasNext()) {
			//Integer entry = it.next();
			System.out.println(it.next());
		}
		long endTime3 = System.currentTimeMillis();
		System.out.println("��ʽ3ʱ���:" + (endTime3 - startTime3));
		
	}
	
	
	public static void testListLoop() {
	List<String> li = new ArrayList<String>();
	
	li.add("1");
	li.add("2");
	li.add("3");
	li.add("4");
	
	//1.for
	//�ŵ㣺Ч����ߣ������죬���Ը����Զ�����������Ԫ��
	//ȱ�㣺���������м��ϣ�ÿ�ζ���Ҫ��Ӧ�ó������ֶ�ǿת�Ͷ���Ļ��list.size,����һ��ȱ����Ǳ��������в�����ɾ��Ԫ��
	long startTime = System.currentTimeMillis();
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
	long endTime = System.currentTimeMillis();
	System.out.println("��ʽ1ʱ���:" + (endTime - startTime));
	
	//2.������
	// �ŵ㣺�������ṩ�˲���Ԫ�صķ��� �����ڱ�������Ӧ�ز���Ԫ��
	//ȱ�㣺���и��ӣ������ԲЧ������������ֱ�����ʽ�ϵ�
	long startTime2 = System.currentTimeMillis();
	Iterator<String> it = li.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	long endTime2 = System.currentTimeMillis();
	System.out.println("��ʽ2ʱ���:" + (endTime2 - startTime2));
	
	//3.Foreach
	//�ŵ㣺�����࣬���׳���
	//ȱ�㣺ֻ�����򵥵ı����������ڱ��������в�����ɾ�����滻�����ݼ��ϡ�
	long startTime3 = System.currentTimeMillis();
	for (String s : li) {
		System.out.println(s);
	} 
	long endTime3 = System.currentTimeMillis();
	System.out.println("��ʽ3ʱ���:" + (endTime3 - startTime3));
	}
	
	public static void main(String[] args) {
		testList();
	}
	


}
