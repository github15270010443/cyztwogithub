package com.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Loop {

	// ʵ��֤��Mapѭ������������С�ڰ��򼶱��ʱ�� keySet()��� һ������7200ms һǧ�� ���72000ms
	// �����������ڰ��򼶱��ʱ��entrySet()��� һ������7100ms һǧ�� ���71000ms

	/**
	 * Map�����ֱ�����ʽ(����key��Value)��
	 * 
	 * @param args
	 */
	public static void testMap(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < 1000; i++) {
			map.put(String.valueOf(i), i);
		}

		long startTime = System.currentTimeMillis();
		// TODO ��ʽһ ��������Ĳ����ڴ���������Ҳ�����ȡ�ı�����ʽ���ڼ�ֵ����Ҫʱʹ�á�
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println("key =" + entry.getKey() + ", value =" + entry.getValue());
		}
		long endTime = System.currentTimeMillis();
		System.out.println("��ʽһʱ���:" + (endTime - startTime));

		// TODO ������ʹ��Iterator����
		long startTime2 = System.currentTimeMillis();
		Iterator<Entry<String, Object>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Entry<String, Object> entry = entries.next();
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("��ʽ��ʱ���:" + (endTime2 - startTime2));

		// TODO �����ġ�ͨ������ֵ������Ч�ʵͣ�
		long startTime3 = System.currentTimeMillis();
		for (String key : map.keySet()) {
			System.out.println("key = " + key + ", value = " + map.get(key));
		}
		long endTime3 = System.currentTimeMillis();
		System.out.println("��ʽ��ʱ���:" + (endTime3 - startTime3));

	}

}
