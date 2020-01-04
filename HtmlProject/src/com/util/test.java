package com.util;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<String,Object>();
		// TODO Auto-generated method stub
		String b[]=new String[]{"aaa","bbb"};
		map.put("aaa", b);
		
		
		
		
		
		Map<String,String> m=new HashMap<String,String>();
		m.put("aaa", map.get("aaa").toString());
		

	}

}
