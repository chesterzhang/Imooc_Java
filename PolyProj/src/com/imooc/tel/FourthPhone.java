package com.imooc.tel;

public class FourthPhone extends ThirdPhone implements Iphoto, INet {
	//public void photo() {
	//	System.out.println("�ֻ����Կ���Ƶ");
	//}
	public void network() {
		System.out.println("�ֻ���������");
	}
	public void game() {
		System.out.println("�ֻ���������Ϸ");
	}
	@Override
	public void photo() {
		System.out.println("�ֻ���������");
		
	}
	@Override
	public void newtork() {
		System.out.println("�ֻ���������");
		
	}
	
	//��д����
	public void connection() {
		System.out.println("�Ĵ��ֻ��е�connection");
		
	}

}


