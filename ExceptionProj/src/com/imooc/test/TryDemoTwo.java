package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {
		int result=test();
		System.out.println("one �� two ������ : "+result);
		
	}
	
	//��try catch finally�ж�����return ʱ��,
	//try  catch �е� return ������������, ���ǻ�����finally����ȥִ��finally �е�return
	public  static int test() {
		 //������������,�����û���������,�������֮��
		Scanner input =new Scanner(System.in);
		System.out.println("���㿪ʼ :  " );
		
		try {
			System.out.print("�������һ������ :  " );
			int one= input.nextInt();
			System.out.print("������ڶ������� :  " );
			int two= input.nextInt();
			return one/two;
			
		}catch(ArithmeticException e) {
			System.out.println("��������Ϊ0 " );
			return 0;
		}catch(InputMismatchException e){
			System.out.println("������������� " );
			return 0;
		}catch(Exception e) {
			System.out.println("�������" );
			return 0;
		}
		finally {
			return -100000;
		}
		
		
	}

}

