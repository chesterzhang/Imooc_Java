package com.imooc.thread;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println( "���߳�1��������");
		MyThread mt=new MyThread();
		mt.start();//�����̣߳��߳�ֻ������һ��
		System.out.println( "���߳�2��������");
	}

}
