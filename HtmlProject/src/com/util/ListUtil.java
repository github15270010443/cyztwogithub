package com.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListUtil {

	/**
	 * List集合的三种遍历方式效率比较  
	 * 结论：实测结果迭代器无论多少条测试都是最快的   iterator > foreach > i++
	 * 但是网上说最快是i++  > foreach  >iterator
	 * i++  一千万64000ms
	 * foreach  一千万62000ms
	 * iterator  一千万60000ms
	 * 
	 * @param args
	 */
	public static void testList() {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}
		// 方式1：i++
//		long startTime = System.currentTimeMillis();
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i);
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("方式1时间差:" + (endTime - startTime));
		
		//方式2:foreach
		long startTime2 = System.currentTimeMillis();
		for(Integer i:list) {
			System.out.println(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("方式2时间差:" + (endTime2 - startTime2));
		
		//方式3：迭代器 iterator
		long startTime3 = System.currentTimeMillis();
		Iterator<Integer> it= list.iterator();
		while (it.hasNext()) {
			//Integer entry = it.next();
			System.out.println(it.next());
		}
		long endTime3 = System.currentTimeMillis();
		System.out.println("方式3时间差:" + (endTime3 - startTime3));
		
	}
	
	
	public static void testListLoop() {
	List<String> li = new ArrayList<String>();
	
	li.add("1");
	li.add("2");
	li.add("3");
	li.add("4");
	
	//1.for
	//优点：效率最高，遍历快，可以根据自定计数器操作元素
	//缺点：不适用所有集合，每次都需要在应用程序中手动强转和额外的获得list.size,还有一个缺点就是遍历过程中不允许删除元素
	long startTime = System.currentTimeMillis();
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
	long endTime = System.currentTimeMillis();
	System.out.println("方式1时间差:" + (endTime - startTime));
	
	//2.迭代器
	// 优点：迭代器提供了操作元素的方法 可以在遍历中相应地操作元素
	//缺点：运行复杂，性能稍差，效率相对其他两种遍历方式较低
	long startTime2 = System.currentTimeMillis();
	Iterator<String> it = li.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	long endTime2 = System.currentTimeMillis();
	System.out.println("方式2时间差:" + (endTime2 - startTime2));
	
	//3.Foreach
	//优点：代码简洁，不易出错。
	//缺点：只能做简单的遍历，不能在遍历过程中操作（删除、替换）数据集合。
	long startTime3 = System.currentTimeMillis();
	for (String s : li) {
		System.out.println(s);
	} 
	long endTime3 = System.currentTimeMillis();
	System.out.println("方式3时间差:" + (endTime3 - startTime3));
	}
	
	public static void main(String[] args) {
		testList();
	}
	


}
