package com.imooc.string;

public class StringDemoTwo {

	public static void main(String[] args) {
		//定义一个字符串"我喜欢Java编程基础,我喜欢Java编程"
		String str=new String("我喜欢Java编程基础,我喜欢Java编程");
		
		//查找'a'字符串中第一次出现的位置
		System.out.println("字符'a'在字符串中第一次出现的位置 : "+str.indexOf('a') );
		
		//查找'a'字符串中最后一次出现的位置
		System.out.println("字符'a'在字符串中第一次出现的位置 : "+str.lastIndexOf('a') );
		
		//从位置8开始，查找'a'字符串中第一次出现的位置
		System.out.println("从位置8开始，字符'a'在字符串中第一次出现的位置 : "+str.indexOf('a',8) );
	}

}
