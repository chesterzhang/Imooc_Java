package com.imooc.method;

public class MethodDemo {

	// ��ӡ����Ǻŵķ���
	public void printStar() {
		System.out.println("**************************");
	}

	public static void main(String[] args) {
		System.out.println("**************************");
		System.out.println("I love Java ! ");
		System.out.println("**************************");
		
		//����һ��MethodDemo��Ķ���myMethodDemo
		MethodDemo myMethodDemo=new MethodDemo();
		//ʹ�ö�����.����()ȥ���÷���
		myMethodDemo.printStar();
		System.out.println("I love Java ! ");
		myMethodDemo.printStar();

	}

}
