package com.imooc.join;

public class MyThreadTest {

	public static void main(String[] args) {
		System.out.println("���߳̿�ʼ����")	;
		
		MyThread mt =new MyThread();
		mt.start();
		
		try {
			mt.join();
			//mt.join(long mills); //���ﵽ mills �����Ժ����ȵ��������߳�
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println("���߳����е�"+i+"��")	;
		}
		System.out.println("���߳̽�������")	;


	}

}



