package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo2 {

	public static void main(String[] args) {
		System.out.println("请输入1-7之间的英文单词:");
		Scanner sc=new Scanner(System.in);
		String  week=sc.next();
		week=week.toUpperCase();//将字符串中的全部字符改成大写
		
		switch(week) {
			case "MONDAY" :  System.out.println("星期1"); break;
			case "TUESDAY" :  System.out.println("星期2"); break;
			case "WEDNESDAY" :  System.out.println("星期3"); break;
			case "THURSDAY" :  System.out.println("星期4"); break;
			case "FRIDAY" :  System.out.println("星期5"); break;
			case "SATURDAY" :  System.out.println("星期6"); break;
			case "SUNDAY" :  System.out.println("星期7"); break;
			default:  System.out.println("该数字超过了1-7的范围");
			}
	}

}


