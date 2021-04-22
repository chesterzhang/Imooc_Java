package com.imooc.sleep;



public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"Ö´ÐÐµÚ"+i+"´Î£¡")	;
			try {
				 Thread.sleep(1000);
				 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	
	
	
}










