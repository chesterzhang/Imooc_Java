package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

//throws ��ʹ��
public class TryDemoThree {
	
	public static void main(String[] args) {
		try {
			int result=test();
			System.out.println("one �� two ������ : "+result);
		} catch (InputMismatchException e) {
			System.out.println("������������ " );
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0 " );
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("������� " );
			e.printStackTrace();
		}
		
	}
	
	//throws �÷� 
	/**
	 * ���Խ����������������ķ���
	 * @return ������������
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 * @throws Exception
	 */
	public  static int test() throws ArithmeticException, InputMismatchException, Exception {
		 //������������,�����û���������,�������֮��
		Scanner input =new Scanner(System.in);
		System.out.println("���㿪ʼ :  " );
		
	 
		System.out.print("�������һ������ :  " );
		int one= input.nextInt();
		System.out.print("������ڶ������� :  " );
		int two= input.nextInt();
		return one/two;
			
		 
		}
	

}
