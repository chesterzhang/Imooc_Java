package com.imooc.thread;


public class MyThread extends Thread {
	public void run() {
		System.out.println(this.getName()+"线程正在运行.");
	}
	

}
