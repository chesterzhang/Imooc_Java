package com.imooc.operator;

import java.util.Scanner;

//�ж�һ������Ƿ�������

public class LeapYearDemo {

	public static void main(String[] args) {
		System.out.println("���������:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		//����:�ܱ�4���������ܱ�100����, �����ܱ�400����
		if ( ( (year%4==0) && ((year%100)!=0) ) || year%400==0) {
			System.out.println(year+"�������꣡");
		}else {
			System.out.println(year+"�겻�����꣡");
		}
		
	}

}
