package com.imooc.method;

public class ExchangeDemo {
	//��������
	public void swap(int a, int b) {
		int temp;
		System.out.println("����ǰ: a="+a+" , b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("������: a="+a+" , b="+b);
	}
	
	//����������÷�������ʵ������
	public void swapTest() {
		int m=4,n=5;
		System.out.println("����ǰ: m="+m+" , n="+n);
		swap(m,n);
		System.out.println("������: m="+m+" , n="+n);
	}
	
	//�����������������������ʵ��������
	public static void main(String[] args) {
	 
		ExchangeDemo ed =new ExchangeDemo();
		ed.swapTest();
 
	}

}
