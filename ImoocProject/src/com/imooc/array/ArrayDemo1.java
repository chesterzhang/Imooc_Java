package com.imooc.array;
import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		//求整型数组的累加和 
		int[] a=new int[5];
		
		
		//从键盘接受数据,为数组元素赋值
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<=4;i++) {
			System.out.println("请输入第"+(i+1)+"个元素");
			a[i]=sc.nextInt();
		}
		
		//打印数组元素
		System.out.println("数组元素的内容为:");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		System.out.println("使用增强型for循环输出数组内容");
		for (int n:a) {
			System.out.println(n+" ");
		}
		
		//求数组元素累加和
		int sum=0;
		for(int i=0; i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println();
		System.out.println("数组元素累加和为:"+sum);
		
	}

}
