package com.imooc.join;

public class MyThread extends Thread {
	
	 

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println(Thread.currentThread().getName()+"ÕýÔÚÖ´ÐÐ"+i)	;
	}
	

}
