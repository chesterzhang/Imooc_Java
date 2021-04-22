package com.imooc.flow1;

public class ForDemo {

	public static void main(String[] args) {
		//  求1到5的累加和
		int sum=0;
		for(int n=1;n<=5;n++) {
			sum=sum+n;
		}
		//System.out.println(n); //会报错,局部变量只在{}花括号内有效
		System.out.println("sum="+sum);

	}

}
