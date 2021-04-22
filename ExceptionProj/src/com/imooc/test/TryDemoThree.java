package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

//throws 的使用
public class TryDemoThree {
	
	public static void main(String[] args) {
		try {
			int result=test();
			System.out.println("one 和 two 的商是 : "+result);
		} catch (InputMismatchException e) {
			System.out.println("必须输入数字 " );
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0 " );
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("程序错误 " );
			e.printStackTrace();
		}
		
	}
	
	//throws 用法 
	/**
	 * 测试接受两个数相除结果的方法
	 * @return 两个数相除结果
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 * @throws Exception
	 */
	public  static int test() throws ArithmeticException, InputMismatchException, Exception {
		 //定义两个整数,接收用户键盘输入,输出两数之商
		Scanner input =new Scanner(System.in);
		System.out.println("运算开始 :  " );
		
	 
		System.out.print("请输入第一个整数 :  " );
		int one= input.nextInt();
		System.out.print("请输入第二个整数 :  " );
		int two= input.nextInt();
		return one/two;
			
		 
		}
	

}
