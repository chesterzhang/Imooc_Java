package com.imooc.join;

public class MyThreadTest {

	public static void main(String[] args) {
		System.out.println("主线程开始运行")	;
		
		MyThread mt =new MyThread();
		mt.start();
		
		try {
			mt.join();
			//mt.join(long mills); //当达到 mills 毫秒以后，优先调用其他线程
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println("主线程运行第"+i+"次")	;
		}
		System.out.println("主线程结束运行")	;


	}

}



