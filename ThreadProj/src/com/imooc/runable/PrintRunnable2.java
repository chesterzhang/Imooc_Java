package com.imooc.runable;

//���̹߳�����Դ
public class PrintRunnable2 implements Runnable {
	
	//i Ϊ����̹߳��õ���Դ
	int i=1;
	@Override
	public void run() {
		//����Thread�ྲ̬����currentThread()��ȡ��ǰ�߳�
		
		while(i<=10) {
			System.out.println(Thread.currentThread().getName()+"�߳���������"+(i++));
		}
		
		
	}

}
