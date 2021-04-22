package com.imooc.operator;

import java.util.Scanner;

//判断一个年份是否是闰年

public class LeapYearDemo {

	public static void main(String[] args) {
		System.out.println("请输入年份:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		//闰年:能被4整除但不能被100整除, 或者能被400整除
		if ( ( (year%4==0) && ((year%100)!=0) ) || year%400==0) {
			System.out.println(year+"年是闰年！");
		}else {
			System.out.println(year+"年不是闰年！");
		}
		
	}

}
