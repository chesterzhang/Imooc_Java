package com.imooc.tel;

public class SmartWatch implements INet, Iphoto{
	
	public void call() {
		System.out.println("�����ֱ���Դ�绰");
	}
	
	public void message() {
		System.out.println("�����ֱ���Է�����");
	}
	
	public void network() {
		System.out.println("�����ֱ���Կ�������");
	}

	@Override
	public void newtork() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connection() {
		 
		INet.super.connection();//Ĭ�ϵ��ýӿ��еķ���
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
