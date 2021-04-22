package com.imooc.runable;

//多线程公用资源
public class PrintRunnable2 implements Runnable {
	
	//i 为多个线程公用的资源
	int i=1;
	@Override
	public void run() {
		//调用Thread类静态方法currentThread()获取当前线程
		
		while(i<=10) {
			System.out.println(Thread.currentThread().getName()+"线程正在运行"+(i++));
		}
		
		
	}

}
