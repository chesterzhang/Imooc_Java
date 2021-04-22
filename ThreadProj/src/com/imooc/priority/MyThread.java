package com.imooc.priority;

public class MyThread  extends Thread{
	
	private String name;
	
	public MyThread (String name) {
		this.name=name;
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println(Thread.currentThread().getName()+"ÕýÔÚÖ´ÐÐ"+i)	;
	}

}
