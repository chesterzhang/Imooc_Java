package com.imooc.method;

public class ArrayDemo {
	//������������������,��������ʱֱ������
	//����һ�������޸�ĳ��������Ԫ�صķ���
	public void updateArray(int[] a) {
		a[3]=15;
		System.out.println("����a��Ԫ��Ϊ : ");
		for (int n :a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5};
		System.out.println("��������ǰ����a��Ԫ��Ϊ : ");
		for( int n :a1) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		ArrayDemo ad=new ArrayDemo();
		ad.updateArray(a1);
		
		System.out.println("�������ú�����a��Ԫ��Ϊ : ");
		for( int n :a1) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		
	}

}
