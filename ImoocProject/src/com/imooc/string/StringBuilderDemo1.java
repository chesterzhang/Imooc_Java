package com.imooc.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder("���");
		str1.append(',');
		str1.append("imooc!");
		System.out.println("str="+str1); 
		
		//���ַ�����ɡ����,iMOOC��
		//���ַ�ʽ
		//1. ʹ��delete����ɾ��mooc, �ٲ���MOOC
		//2.ʹ��replace����ֱ���滻
		System.out.println("�滻��:"+str1.delete(4,8).insert(4, "MOOC"));
		System.out.println("�滻��:"+str1.replace(4, 8, "MOOC"));
		
		//���ַ�����ȡ��"���"�����
		System.out.println("�滻��:"+str1.substring(0,2));

	}

}
