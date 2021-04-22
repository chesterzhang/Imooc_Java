package com.imooc.test;

import java.util.Scanner;

//throw ���
public class TryDemoFour {

	public static void main(String[] args) {
		//testAge1();
		
		try {
			testAge2();
		} catch (HotelAgeException e) {
			//��ӡException����ʵ����ʱ���캯��������ַ���, �̳���Throwable��, ��Java api
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * throw�׳��쳣���� ������ 
	 * 1. �ڷ�����ʹ��try catch, try�а��� throw ���,�Լ��׳��쳣 
	 * 2. �ڷ����а���throw���, �������崦throws���쳣��, �ڵ��÷�����ʹ��try catch����
	 *     throws �����쳣������ throw�����������丸��
	 */

	// �����Ƶ����ס���� :�޶�����,18������,80�����ϵ�ס�ͱ�����������ͬ
	public static void testAge1() {

		try {
			System.out.println("���������� : ");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if (age < 18 || age > 80) {
				throw new Exception("18������,80�����ϵ�ס�ͱ�����������ͬ");
			} else {
				System.out.println("��ӭ���٣�");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// �����Ƶ����ס���� :�޶�����,18������,80�����ϵ�ס�ͱ�����������ͬ
	public static void testAge2() throws Exception{

		System.out.println("���������� : ");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age < 18 || age > 80) {
			//throw new Exception("18������,80�����ϵ�ס�ͱ�����������ͬ");
			//Ҳ���Ի����Զ����쳣��
			throw new HotelAgeException();
			
		} else {
			System.out.println("��ӭ���٣�");
		}

	}

}
