package com.imooc.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder("你好");
		str1.append(',');
		str1.append("imooc!");
		System.out.println("str="+str1); 
		
		//将字符串变成”你好,iMOOC“
		//两种方式
		//1. 使用delete方法删除mooc, 再插入MOOC
		//2.使用replace方法直接替换
		System.out.println("替换后:"+str1.delete(4,8).insert(4, "MOOC"));
		System.out.println("替换后:"+str1.replace(4, 8, "MOOC"));
		
		//在字符串中取出"你好"并输出
		System.out.println("替换后:"+str1.substring(0,2));

	}

}
