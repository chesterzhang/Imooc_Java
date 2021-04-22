package com.imooc.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		/*>=90,优秀
		 [80,90),良
		 [60,80)中
		 小于60,不及格
		*/
		System.out.println("请输入成绩:");
		Scanner sc =new Scanner(System.in);
		int score =sc.nextInt();
		if (score>=90) {
			System.out.println("优！");
		}else if (score>=80) {
			System.out.println("良！");
		}else if (score>=60) {
			System.out.println("中！");
		}else {
			System.out.println("不及格！");
		}
	
	}

}


