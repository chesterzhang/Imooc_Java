package com.imooc.sleep;

public class MyThreadTest {

	public static void main(String[] args) {
		
		MyThread mt =new MyThread();
		Thread t= new Thread(mt);
		t.start();
		
		Thread t1= new Thread(mt);
		t1.start();

	}

}
