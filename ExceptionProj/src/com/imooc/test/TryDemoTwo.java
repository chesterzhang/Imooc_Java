package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {
		int result=test();
		System.out.println("one 和 two 的商是 : "+result);
		
	}
	
	//当try catch finally中都有有return 时候,
	//try  catch 中的 return 并不会起作用, 而是会跳到finally里面去执行finally 中的return
	public  static int test() {
		 //定义两个整数,接收用户键盘输入,输出两数之商
		Scanner input =new Scanner(System.in);
		System.out.println("运算开始 :  " );
		
		try {
			System.out.print("请输入第一个整数 :  " );
			int one= input.nextInt();
			System.out.print("请输入第二个整数 :  " );
			int two= input.nextInt();
			return one/two;
			
		}catch(ArithmeticException e) {
			System.out.println("除数不能为0 " );
			return 0;
		}catch(InputMismatchException e){
			System.out.println("不能输入非数字 " );
			return 0;
		}catch(Exception e) {
			System.out.println("程序出错" );
			return 0;
		}
		finally {
			return -100000;
		}
		
		
	}

}

