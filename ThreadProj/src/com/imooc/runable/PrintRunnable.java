package com.imooc.runable;

//ʹ��Runnable �ӿ�ʵ���࣬��������ഴ���߳�
public class PrintRunnable implements Runnable {
	
		
	@Override
	public void run() {
		//����Thread�ྲ̬����currentThread()��ȡ��ǰ�߳�
		
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"�߳���������"+i);
		}
		
		
	}

}
