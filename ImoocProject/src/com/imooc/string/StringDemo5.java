package com.imooc.string;

//==和equals方法的区别
public class StringDemo5 {

	public static void main(String[] args) {
		String str1="imooc";
		String str2="imooc";
		String str3=new String("imooc");
		System.out.println("str1 和 str2 内容 相同吗? : "+(str1.equals(str2)));
		System.out.println("str1 和 str3 内容 相同吗? : "+(str1.equals(str3)));
		
		System.out.println("str1 和 str2 地址 相同吗? : "+(str1==str2));
		System.out.println("str1 和 str3 地址 相同吗? : "+(str1==str3));

	}

}
