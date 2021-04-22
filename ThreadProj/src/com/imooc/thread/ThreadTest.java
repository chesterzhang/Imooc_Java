package com.imooc.thread;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println( "主线程1正在运行");
		MyThread mt=new MyThread();
		mt.start();//启动线程，线程只能启动一次
		System.out.println( "主线程2正在运行");
	}

}
