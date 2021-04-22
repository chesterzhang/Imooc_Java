package com.imooc.runable;

public class PrintRunnableTest {
	public static void main(String[] args) {
		
		PrintRunnable pr1 =new PrintRunnable();
		Thread t1 =new Thread(pr1);
		t1.start();
		 
		PrintRunnable pr2 =new PrintRunnable();
		Thread t2 =new Thread(pr2);
		t2.start();
		
	}
}
