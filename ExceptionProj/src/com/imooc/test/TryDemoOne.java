package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
	
		
		 //������������,�����û���������,�������֮��
		Scanner input =new Scanner(System.in);
		System.out.println("���㿪ʼ :  " );
		
		try {
			System.out.print("�������һ������ :  " );
			int one= input.nextInt();
			System.out.print("������ڶ������� :  " );
			int two= input.nextInt();
			System.out.println("one �� two ������ : "+(one/two));
			
		}catch(ArithmeticException e) {
			//java.lang.ArithmeticException: / by zero
			// �����쳣����Exception������
			System.out.println("��������Ϊ0 " );
			System.exit(1);//��ֹ����
		}catch(InputMismatchException e){
			//java.util.InputMismatchException
			System.out.println("������������� " );
			System.exit(1);
		}catch(Exception e) {
			System.out.println("�������" );
			e.printStackTrace();
		}
		finally {
			System.out.println("������� " );
		}

	}

}
