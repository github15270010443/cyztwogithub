package com.cyz.array;

public class ArrayDefine {
	/*Java������������ַ�ʽ*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]=new int[5];	            //1.����ʱ���峤�� int a[]=new int[5]; 5��ʾ���ȣ�Ҳ������������5������
	int b[]=new int[]{1,3,3,44,4};	//2.����ʱ��ֵ     int b[]=new int[]{1,3,3,44,4}; ��������5������,�ö��Ÿ�����������±��Ǵ�0��ʼ��  ���� a[0]=1
	int c[]={1,3,2,4,5}; 	        //3.ֱ�Ӹ��ƴ���   int a[]={1,3,2,4,5} 
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
