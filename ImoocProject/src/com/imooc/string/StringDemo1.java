package com.imooc.string;

//String ���ȷ��� length(), substring(), charAt(),
public class StringDemo1 {

	public static void main(String[] args) {
		
		//����һ���ַ���"Java ��� ����"
		String str="Java ��� ����";
		
		//��ӡ����ַ����ĳ���
		System.out.println("�ַ����ĳ����� : " +str.length()); 
		
		//ȡ���ַ� "��" ����� 
		System.out.println(str.charAt(6)); 

		//ȥ���ִ�"��� ����"�����
		System.out.println(str.substring(5)); 
		System.out.println(str.substring(5,10)); 
		
	}

}
