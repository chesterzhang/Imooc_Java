package com.imooc.runable;

public class PrintRunnableTest2 {

	public static void main(String[] args) {
		
		PrintRunnable2 pr1 =new PrintRunnable2();
		Thread t1 =new Thread(pr1);
		t1.start();
	 
		Thread t2 =new Thread(pr1);
		t2.start();

	}

}
