package com.imooc.runable;

//使用Runnable 接口实现类，再用这个类创建线程
public class PrintRunnable implements Runnable {
	
		
	@Override
	public void run() {
		//调用Thread类静态方法currentThread()获取当前线程
		
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"线程正在运行"+i);
		}
		
		
	}

}
