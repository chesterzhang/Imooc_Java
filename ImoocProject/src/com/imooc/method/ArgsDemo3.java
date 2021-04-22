package com.imooc.method;
/**
 * 关于可变参数列表和重载的问题
 * @author Chester_Zhang
 *
 */

//可变参数列表 方法重载
//优先调用不带可变参数的方法
public class ArgsDemo3 {
	
	public int plus(int a, int b) {
		System.out.println("不带可变参数的方法被调用！");
		return a+b;
	}
	
	public int plus(int... a) {
		int sum=0;
		for(int n:a) {
			sum=sum+n;
		}
		System.out.println("带可变参数的方法被调用！");
		return sum;
	}
		
	public static void main(String[] args) {
		ArgsDemo3 ad= new ArgsDemo3();
		System.out.println("和为 : "+ad.plus(1,2));//优先调用不带可变参数的方法

	}

}
