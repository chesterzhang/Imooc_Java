package com.imooc.thread1;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(this.getName()+"正在运行"+i);
		}
		
	}
	
}


