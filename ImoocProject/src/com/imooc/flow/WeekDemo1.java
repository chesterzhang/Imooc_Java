package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo1 {

	public static void main(String[] args) {
		System.out.println("请输入1-7之间的数字:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
			case 1 :  System.out.println("星期1"); break;
			case 2 :  System.out.println("星期2"); break;
			case 3 :  System.out.println("星期3"); break;
			case 4 :  System.out.println("星期4"); break;
			case 5 :  System.out.println("星期5"); break;
			case 6 :  System.out.println("星期6"); break;
			case 7 :  System.out.println("星期7"); break;
			default:  System.out.println("该数字超过了1-7的范围");
			
		}


	}

}



