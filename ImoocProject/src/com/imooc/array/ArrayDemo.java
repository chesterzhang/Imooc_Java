package com.imooc.array;

public class ArrayDemo {

	public static void main(String[] args) {
		//声明并创建一个整形数组
		int[] intArray=new int[5];
		
		//声明并创建一个字符串数组
		String[]  strArray= new String[10];
		
		//声明并创建一个float串数组
		float[] floatArray=new float[5];
		
		//初始化字符数组
		char[] ch= {'a','b','c','d'};
		
		System.out.println("ch数组长度为:"+ch.length);
		System.out.println("intArray数组的第2个元素为:"+intArray[1]);
		System.out.println("strArray数组的第5个元素为:"+strArray[4]);
		System.out.println("floatArray数组的最后1个元素为:"+floatArray[floatArray.length-1]);
		
		
		
	}

}
