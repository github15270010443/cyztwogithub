package com.cyz.recursion;

public class factorial {
//�ݹ� N�Ľ׳�
//	���׳��ǻ�˹�١�������Christian Kramp��1760��1826���� 1808 �귢����������ţ�����ѧ���
//	һ���������Ľ׳ˣ�factorial��������С�ڼ����ڸ������������Ļ�������0�Ľ׳�Ϊ1����Ȼ��n�Ľ׳�д��n!��
//	1808�꣬��˹�١��������������ʾ�����༴n!=1��2��3��...��n���׳�����Եݹ鷽ʽ���壺0!=1��n!=(n-1)!��n����
 public static int	factorials(int m){
	 if(m<0)
	   return 0;
	 else if(m==1)
	   return 1;
	 else if(m>1)
	   return m*factorials(m-1);
	return m;
 }
 public static void main(String[] args) {
	System.err.println(factorials(6));
	System.err.println("5*4*3*2*1*6=720");
}
}
