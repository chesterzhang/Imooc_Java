package com.imooc.operator;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		//�ж�һ����������������ż��,���������ӡ���
		//�Ӽ��̽�������
		System.out.println("������һ������:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if ((n%2)==0) {
			System.out.println(n+"��ż��!");
		}else {
			System.out.println(n+"������!");
		}
		
	}
}

