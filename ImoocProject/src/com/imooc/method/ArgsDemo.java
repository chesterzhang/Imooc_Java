package com.imooc.method;

//�ɱ�����б�
public class ArgsDemo {
	//	�Զ��int�ͱ����������
	public void sum(int... n) {
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		System.out.println("sum="+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsDemo ad=new ArgsDemo();
		ad.sum(1);
		ad.sum(1,2);
	}

}
