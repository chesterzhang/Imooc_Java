package com.imooc.array;

public class ArrayDemo {

	public static void main(String[] args) {
		//����������һ����������
		int[] intArray=new int[5];
		
		//����������һ���ַ�������
		String[]  strArray= new String[10];
		
		//����������һ��float������
		float[] floatArray=new float[5];
		
		//��ʼ���ַ�����
		char[] ch= {'a','b','c','d'};
		
		System.out.println("ch���鳤��Ϊ:"+ch.length);
		System.out.println("intArray����ĵ�2��Ԫ��Ϊ:"+intArray[1]);
		System.out.println("strArray����ĵ�5��Ԫ��Ϊ:"+strArray[4]);
		System.out.println("floatArray��������1��Ԫ��Ϊ:"+floatArray[floatArray.length-1]);
		
		
		
	}

}
