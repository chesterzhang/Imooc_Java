package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo2 {

	public static void main(String[] args) {
		System.out.println("������1-7֮���Ӣ�ĵ���:");
		Scanner sc=new Scanner(System.in);
		String  week=sc.next();
		week=week.toUpperCase();//���ַ����е�ȫ���ַ��ĳɴ�д
		
		switch(week) {
			case "MONDAY" :  System.out.println("����1"); break;
			case "TUESDAY" :  System.out.println("����2"); break;
			case "WEDNESDAY" :  System.out.println("����3"); break;
			case "THURSDAY" :  System.out.println("����4"); break;
			case "FRIDAY" :  System.out.println("����5"); break;
			case "SATURDAY" :  System.out.println("����6"); break;
			case "SUNDAY" :  System.out.println("����7"); break;
			default:  System.out.println("�����ֳ�����1-7�ķ�Χ");
			}
	}

}


