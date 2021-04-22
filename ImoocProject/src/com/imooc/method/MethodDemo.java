package com.imooc.method;

public class MethodDemo {

	// 打印输出星号的方法
	public void printStar() {
		System.out.println("**************************");
	}

	public static void main(String[] args) {
		System.out.println("**************************");
		System.out.println("I love Java ! ");
		System.out.println("**************************");
		
		//创建一个MethodDemo类的对象myMethodDemo
		MethodDemo myMethodDemo=new MethodDemo();
		//使用对象名.方法()去调用方法
		myMethodDemo.printStar();
		System.out.println("I love Java ! ");
		myMethodDemo.printStar();

	}

}
