package com.imooc.operator;

public class MathDemo {

	public static void main(String[] args) {
		int num1=10, num2=5;
		int result;
		//�ӷ�
		result=num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		//�ַ�����������
		System.out.println(num1+num2);//���ּӷ�����
		System.out.println(""+num1+num2);//�ַ�����������
		//����
		result=num1-num2;
		System.out.println(num1+"-"+num2+"="+result);
		//�˷�
		result=num1*num2;
		System.out.println(num1+"*"+num2+"="+result);
		//����
		result=num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		System.out.println("13/5="+13/5);//���ӷ�ĸ��������,���ҲΪ����
		System.out.println("13/5.0="+13/5.0);
		//������
		result=13%num2;
		System.out.println("13%5="+result);
		 
		System.out.println("13.5%5="+13.5 %num2);
	}

}


