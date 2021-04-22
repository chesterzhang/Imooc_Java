package com.imooc.priority;

import com.imooc.join.MyThread;

public class MyThreadTest {

	public static void main(String[] args) {
		// 获取主线程优先级
		System.out.println("主线程优先级为 : "+Thread.currentThread().getPriority())	;
		
		com.imooc.priority.MyThread mt1= new com.imooc.priority.MyThread("线程1");
		com.imooc.priority.MyThread mt2= new com.imooc.priority.MyThread("线程2");
		
		//mt1.setPriority(10);
		mt1.setPriority(Thread.MAX_PRIORITY);//和上一句等价
		mt2.setPriority(Thread.MIN_PRIORITY);
		
		mt1.start();
		mt2.start(); 
		
		//System.out.println("线程1的优先级:"+ mt1.getPriority());
		
		
	}

}
