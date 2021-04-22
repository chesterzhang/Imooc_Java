package com.imooc.string;

import java.io.UnsupportedEncodingException;

//字符串和byte数组之间的相互转换 
public class StringDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str="Java 编程 基础";
		//将字符串转换为byte数组,并打印输出
		byte[] arrs=str.getBytes("GBK"); //也可以不指定编码格式,win默认GBK，mac默认UTF-8
		for(int i=0;i<arrs.length;i++) {
			System.out.println(arrs[i]);
		}
		
		//将byte数组转换为字符串
		String str1=new String(arrs,"GBK");//也可以不指定编码格式,win默认GBK
		System.out.println(str1);
		
	}

}



