package com.imooc.method;

public class ExchangeDemo {
	//交换方法
	public void swap(int a, int b) {
		int temp;
		System.out.println("交换前: a="+a+" , b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("交换后: a="+a+" , b="+b);
	}
	
	//主方法外调用方法不用实例化类
	public void swapTest() {
		int m=4,n=5;
		System.out.println("交换前: m="+m+" , n="+n);
		swap(m,n);
		System.out.println("交换后: m="+m+" , n="+n);
	}
	
	//主方法调用其他方法必须得实例化对象
	public static void main(String[] args) {
	 
		ExchangeDemo ed =new ExchangeDemo();
		ed.swapTest();
 
	}

}
