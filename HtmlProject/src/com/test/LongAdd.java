package com.test;

public class LongAdd {

	public static void main(String[] args) {
		//假设接收的值
		String cumulativeNum="1000";
		String usableNum="2000";
		String changeNum="3000";
		
		//if(true) {
			Long num= Long.parseLong(usableNum)+Long.parseLong(changeNum);
			System.err.println("打印结果："+num);
//	}
	}
}
