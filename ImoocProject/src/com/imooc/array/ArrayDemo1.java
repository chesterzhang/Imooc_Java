package com.imooc.array;
import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		//������������ۼӺ� 
		int[] a=new int[5];
		
		
		//�Ӽ��̽�������,Ϊ����Ԫ�ظ�ֵ
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<=4;i++) {
			System.out.println("�������"+(i+1)+"��Ԫ��");
			a[i]=sc.nextInt();
		}
		
		//��ӡ����Ԫ��
		System.out.println("����Ԫ�ص�����Ϊ:");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		System.out.println("ʹ����ǿ��forѭ�������������");
		for (int n:a) {
			System.out.println(n+" ");
		}
		
		//������Ԫ���ۼӺ�
		int sum=0;
		for(int i=0; i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println();
		System.out.println("����Ԫ���ۼӺ�Ϊ:"+sum);
		
	}

}
