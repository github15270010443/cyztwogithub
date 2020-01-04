package com.test;

import java.util.HashMap;
import java.util.Map;

public class TabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("b", 2);
		
		if(map.containsKey("a")) {
			System.err.println("a");
		}else if(map.containsKey("b")) {
			System.err.println("b");
		}else {
			System.err.println("c");
		}
	}

}
