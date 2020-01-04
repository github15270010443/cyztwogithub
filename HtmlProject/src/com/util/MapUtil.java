package com.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapUtil {
	/**
	 * Map���ϵ����ֱ�����ʽ(����key)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "ab");
		map.put(4, "ab");
		map.put(4, "ab");// ��������ͬ �� ���Լ�ɸѡ
		System.out.println(map.size());
		// ��һ�֣�
		/*
		 * Set<Integer> set = map.keySet(); //�õ�����key�ļ���
		 * 
		 * for (Integer in : set) { String str = map.get(in); System.out.println(in +
		 * "     " + str); }
		 */
		System.out.println("��һ�֣�ͨ��Map.keySet����key��value��");
		for (Integer in : map.keySet()) {
			// map.keySet()���ص�������key��ֵ
			String str = map.get(in);// �õ�ÿ��key�����value��ֵ
			System.out.println(in + "     " + str);
		}
		// �ڶ��֣�
		System.out.println("�ڶ��֣�ͨ��Map.entrySetʹ��iterator����key��value��");
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
		// �����֣��Ƽ���������������ʱ
		System.out.println("�����֣�ͨ��Map.entrySet����key��value");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			// Map.entry<Integer,String> ӳ�����-ֵ�ԣ� �м��������������������entry
			// entry.getKey() ;entry.getValue(); entry.setValue();
			// map.entrySet() ���ش�ӳ���а�����ӳ���ϵ�� Set��ͼ��
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
		// �����֣�
		System.out.println("�����֣�ͨ��Map.values()�������е�value�������ܱ���key");
		for (String v : map.values()) {
			System.out.println("value= " + v);
		}
	}
}