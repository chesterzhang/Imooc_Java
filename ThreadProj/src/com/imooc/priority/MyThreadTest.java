package com.imooc.priority;

import com.imooc.join.MyThread;

public class MyThreadTest {

	public static void main(String[] args) {
		// ��ȡ���߳����ȼ�
		System.out.println("���߳����ȼ�Ϊ : "+Thread.currentThread().getPriority())	;
		
		com.imooc.priority.MyThread mt1= new com.imooc.priority.MyThread("�߳�1");
		com.imooc.priority.MyThread mt2= new com.imooc.priority.MyThread("�߳�2");
		
		//mt1.setPriority(10);
		mt1.setPriority(Thread.MAX_PRIORITY);//����һ��ȼ�
		mt2.setPriority(Thread.MIN_PRIORITY);
		
		mt1.start();
		mt2.start(); 
		
		//System.out.println("�߳�1�����ȼ�:"+ mt1.getPriority());
		
		
	}

}
