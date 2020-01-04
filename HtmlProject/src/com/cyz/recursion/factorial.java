package com.cyz.recursion;

public class factorial {
//递归 N的阶乘
//	“阶乘是基斯顿·卡曼（Christian Kramp，1760～1826）于 1808 年发明的运算符号，是数学术语。
//	一个正整数的阶乘（factorial）是所有小于及等于该数的正整数的积，并且0的阶乘为1。自然数n的阶乘写作n!。
//	1808年，基斯顿·卡曼引进这个表示法。亦即n!=1×2×3×...×n。阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n。”
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
