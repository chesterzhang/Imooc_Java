package com.imooc.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		/*>=90,����
		 [80,90),��
		 [60,80)��
		 С��60,������
		*/
		System.out.println("������ɼ�:");
		Scanner sc =new Scanner(System.in);
		int score =sc.nextInt();
		if (score>=90) {
			System.out.println("�ţ�");
		}else if (score>=80) {
			System.out.println("����");
		}else if (score>=60) {
			System.out.println("�У�");
		}else {
			System.out.println("������");
		}
	
	}

}


