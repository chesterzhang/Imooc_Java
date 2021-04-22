package com.imooc.operator;

public class MathDemo {

	public static void main(String[] args) {
		int num1=10, num2=5;
		int result;
		//加法
		result=num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		//字符串连接运算
		System.out.println(num1+num2);//数字加法运算
		System.out.println(""+num1+num2);//字符串连接运算
		//减法
		result=num1-num2;
		System.out.println(num1+"-"+num2+"="+result);
		//乘法
		result=num1*num2;
		System.out.println(num1+"*"+num2+"="+result);
		//除法
		result=num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		System.out.println("13/5="+13/5);//分子分母都是整形,结果也为整形
		System.out.println("13/5.0="+13/5.0);
		//求余数
		result=13%num2;
		System.out.println("13%5="+result);
		 
		System.out.println("13.5%5="+13.5 %num2);
	}

}


