package com.imooc.string;

public class StringDemoTwo {

	public static void main(String[] args) {
		//����һ���ַ���"��ϲ��Java��̻���,��ϲ��Java���"
		String str=new String("��ϲ��Java��̻���,��ϲ��Java���");
		
		//����'a'�ַ����е�һ�γ��ֵ�λ��
		System.out.println("�ַ�'a'���ַ����е�һ�γ��ֵ�λ�� : "+str.indexOf('a') );
		
		//����'a'�ַ��������һ�γ��ֵ�λ��
		System.out.println("�ַ�'a'���ַ����е�һ�γ��ֵ�λ�� : "+str.lastIndexOf('a') );
		
		//��λ��8��ʼ������'a'�ַ����е�һ�γ��ֵ�λ��
		System.out.println("��λ��8��ʼ���ַ�'a'���ַ����е�һ�γ��ֵ�λ�� : "+str.indexOf('a',8) );
	}

}
