package com.imooc.string;

//==��equals����������
public class StringDemo5 {

	public static void main(String[] args) {
		String str1="imooc";
		String str2="imooc";
		String str3=new String("imooc");
		System.out.println("str1 �� str2 ���� ��ͬ��? : "+(str1.equals(str2)));
		System.out.println("str1 �� str3 ���� ��ͬ��? : "+(str1.equals(str3)));
		
		System.out.println("str1 �� str2 ��ַ ��ͬ��? : "+(str1==str2));
		System.out.println("str1 �� str3 ��ַ ��ͬ��? : "+(str1==str3));

	}

}
