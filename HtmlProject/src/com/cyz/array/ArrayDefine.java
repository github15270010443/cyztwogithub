package com.cyz.array;

public class ArrayDefine {
	/*Java创建数组的三种方式*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]=new int[5];	            //1.创建时定义长度 int a[]=new int[5]; 5表示长度，也就是数组中有5个数据
	int b[]=new int[]{1,3,3,44,4};	//2.创建时赋值     int b[]=new int[]{1,3,3,44,4}; 数组中有5个数据,用逗号隔开，数组的下标是从0开始的  例： a[0]=1
	int c[]={1,3,2,4,5}; 	        //3.直接复制创建   int a[]={1,3,2,4,5} 
    System.err.println(b[0]+a[0]+c[0]);
    System.err.println(a[0]);
    String d[]=new String[5];
    System.err.println(d[0]);  
    
    int ss;
    ss=22;
    System.err.println(ss);
	}
	
	public void get(String a) {
		
	}
	
    public void get(String a,String b) {
		
	}

}
