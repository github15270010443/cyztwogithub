package com.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Loop {

	// 实践证明Map循环，当数据量小于百万级别的时候 keySet()最快 一百万大概7200ms 一千万 大概72000ms
	// 当数据量大于百万级别的时候entrySet()最快 一百万大概7100ms 一千万 大概71000ms

	/**
	 * Map的三种遍历方式(包含key和Value)：
	 * 
	 * @param args
	 */
	public static void testMap(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < 1000; i++) {
			map.put(String.valueOf(i), i);
		}

		long startTime = System.currentTimeMillis();
		// TODO 方式一 这是最常见的并且在大多数情况下也是最可取的遍历方式。在键值都需要时使用。
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println("key =" + entry.getKey() + ", value =" + entry.getValue());
		}
		long endTime = System.currentTimeMillis();
		System.out.println("方式一时间差:" + (endTime - startTime));

		// TODO 方法二使用Iterator遍历
		long startTime2 = System.currentTimeMillis();
		Iterator<Entry<String, Object>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Entry<String, Object> entry = entries.next();
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("方式二时间差:" + (endTime2 - startTime2));

		// TODO 方法四、通过键找值遍历（效率低）
		long startTime3 = System.currentTimeMillis();
		for (String key : map.keySet()) {
			System.out.println("key = " + key + ", value = " + map.get(key));
		}
		long endTime3 = System.currentTimeMillis();
		System.out.println("方式四时间差:" + (endTime3 - startTime3));

	}

}
