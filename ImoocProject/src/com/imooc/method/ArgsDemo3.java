package com.imooc.method;
/**
 * ���ڿɱ�����б�����ص�����
 * @author Chester_Zhang
 *
 */

//�ɱ�����б� ��������
//���ȵ��ò����ɱ�����ķ���
public class ArgsDemo3 {
	
	public int plus(int a, int b) {
		System.out.println("�����ɱ�����ķ��������ã�");
		return a+b;
	}
	
	public int plus(int... a) {
		int sum=0;
		for(int n:a) {
			sum=sum+n;
		}
		System.out.println("���ɱ�����ķ��������ã�");
		return sum;
	}
		
	public static void main(String[] args) {
		ArgsDemo3 ad= new ArgsDemo3();
		System.out.println("��Ϊ : "+ad.plus(1,2));//���ȵ��ò����ɱ�����ķ���

	}

}
