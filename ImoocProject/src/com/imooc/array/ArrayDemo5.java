package com.imooc.array;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// ��ά��������
		int[][] intArray;
		float[][] floatArray;
		
		//����һ���������е�int����
		intArray=new int[3][3];
		System.out.println("intArray��������еڶ���Ԫ��:"+intArray[2][1]);
		
		//Ϊ�ڶ��е���������Ϊ9	
		intArray[1][2]=9;
		System.out.println("intArray����ڶ��е�����Ԫ��Ϊ:"+intArray[1][2]);
		
		//���������ͬʱ���д���
		char[][] ch= new char[3][5];
		
		//����float���͵�����ʱ��,ָֻ������
		floatArray=new float[3][ ]; //����Ҫָ������,��������ʡ��
		//System.out.println(floatArray[0][0]); //�ᱨ��
		//ÿһ���൱��һ��һά����
		floatArray[0]=new float[3];
		floatArray[1]=new float[4];
		floatArray[2]=new float[5];
		System.out.println(floatArray[0][0]); 
		
		//��ά�����ʼ��
		int[][] num= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("num�����1�е�2�е�Ԫ��Ϊ:"+num[0][1]); 
		System.out.println("num���������Ϊ:"+num.length);
		System.out.println("num���������Ϊ:"+num[0].length);
		
		int[][] num1= {{78,98},{65,75,63,63},{98}};
		System.out.println("num1�����1�е�����Ϊ:"+num1[0].length);
		
		
		
		
	}

}

