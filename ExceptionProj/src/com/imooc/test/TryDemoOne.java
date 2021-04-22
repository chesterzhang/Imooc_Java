package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
	
		
		 //定义两个整数,接收用户键盘输入,输出两数之商
		Scanner input =new Scanner(System.in);
		System.out.println("运算开始 :  " );
		
		try {
			System.out.print("请输入第一个整数 :  " );
			int one= input.nextInt();
			System.out.print("请输入第二个整数 :  " );
			int two= input.nextInt();
			System.out.println("one 和 two 的商是 : "+(one/two));
			
		}catch(ArithmeticException e) {
			//java.lang.ArithmeticException: / by zero
			// 所有异常都是Exception的子类
			System.out.println("除数不能为0 " );
			System.exit(1);//终止程序
		}catch(InputMismatchException e){
			//java.util.InputMismatchException
			System.out.println("不能输入非数字 " );
			System.exit(1);
		}catch(Exception e) {
			System.out.println("程序出错" );
			e.printStackTrace();
		}
		finally {
			System.out.println("运算结束 " );
		}

	}

}
