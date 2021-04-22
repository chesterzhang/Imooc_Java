package com.imooc.operator;

import java.util.Scanner;

public class LogicDemo3 {

	public static void main(String[] args) {
		// 
		System.out.println("请输入一个整数：");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if (!((n%3)==0)) {
			System.out.println(n+"不能被3整除！");
		}else {
			System.out.println(n+"能被3整除！");
		}
		

	}

}
