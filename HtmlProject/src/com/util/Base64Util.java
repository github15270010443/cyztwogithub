package com.util;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;


public class Base64Util {
	public static String getFromBASE64(String s) {
		if (s == null)
			return null;
		Decoder decoder = Base64.getDecoder();
		String decode = null;
		try {
			byte[] stringToBase = decoder.decode(s);
			decode= new String(stringToBase);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decode;
	}

	public static String setFromBASE64(String s) {
		if (s == null)
			return null;

		Encoder encoder = Base64.getEncoder();
		String encode = null;
		try {
			encode = encoder.encodeToString(s.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encode;
	}
	
	public static void main(String[] args) {
		String a=setFromBASE64("123456");
		System.out.println(a);
	    String b=getFromBASE64(a);
		System.out.println(b);
	}

}
