package com.imooc.test;

import java.util.Scanner;

//throw 语句
public class TryDemoFour {

	public static void main(String[] args) {
		//testAge1();
		
		try {
			testAge2();
		} catch (HotelAgeException e) {
			//打印Exception对象实例化时构造函数传入的字符串, 继承自Throwable类, 见Java api
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * throw抛出异常对象 处理方案 
	 * 1. 在方法中使用try catch, try中包含 throw 语句,自己抛出异常 
	 * 2. 在方法中包含throw语句, 方法定义处throws出异常类, 在调用方法处使用try catch处理
	 *     throws 出的异常必须是 throw对象的类或者其父类
	 */

	// 描述酒店的入住规则 :限定年龄,18岁以下,80岁以上的住客必须有亲友陪同
	public static void testAge1() {

		try {
			System.out.println("请输入年龄 : ");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if (age < 18 || age > 80) {
				throw new Exception("18岁以下,80岁以上的住客必须有亲友陪同");
			} else {
				System.out.println("欢迎光临！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 描述酒店的入住规则 :限定年龄,18岁以下,80岁以上的住客必须有亲友陪同
	public static void testAge2() throws Exception{

		System.out.println("请输入年龄 : ");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age < 18 || age > 80) {
			//throw new Exception("18岁以下,80岁以上的住客必须有亲友陪同");
			//也可以换成自定义异常类
			throw new HotelAgeException();
			
		} else {
			System.out.println("欢迎光临！");
		}

	}

}
