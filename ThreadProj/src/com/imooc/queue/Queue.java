package com.imooc.queue;

public class Queue {

	// һ��������һ������
	private int n;
	
	boolean flag= false;//�����ж��Ƿ�����Ʒ���Ա�����
	
	
	//������Ʒ
	public synchronized void produce(int n) {
		if(flag) {//���Ѿ�����Ʒ��ʱ��,�����������ˣ���������
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���� : " + n+"����Ʒ");
		this.n = n;
		this.flag=true;//�������,����Ʒ
		notifyAll();//������ϣ����������߳�
	}

	//������Ʒ
	public synchronized void consume() {
		if(!flag) {//��û����Ʒ��ʱ���̵߳ȴ�
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���� : " + n+"����Ʒ");
		this.flag=false;//�������,û����Ʒ
	}
}
