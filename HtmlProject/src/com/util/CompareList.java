package com.util;

import java.util.ArrayList;
import java.util.List;

public class CompareList {

	public static void main(String[] args) {
      List<String>  list1=new ArrayList<>();	
      list1.add("a");
      list1.add("b");
      list1.add("c");
      List<String>  list2=new ArrayList<>();	
      list2.add("b");
      list2.add("c");
      list2.add("d");
      
      List<String>  list3=new ArrayList<>();
      List<String>  list4=new ArrayList<>();
      list3.addAll(list1);
      list4.addAll(list1);
      //a.removeAll(b);
      //����
      //list1.addAll(list2);
      //����
      list1.retainAll(list2);
      //list1��list2�Ĳ
      list3.removeAll(list2);
      //list2��list1�Ĳ
      list2.removeAll(list4);
      //�
      //list1.removeAll(list2); 
      System.err.println(list1.size());
	}

}
