package com.imooc.test;
//����ѧϰ�������������Object�е�equals()����

import com.imooc.Animal.Animal;

public class Test3 {

	public static void main(String[] args) {
		Animal one=new Animal("����",2);
		Animal two=new Animal("����",2);
		
		/*
		 * equals��������
		 * 1. �̳�Object�е�equals����ʱ,�Ƚϵ������������Ƿ�ָ��һ������
		 * 2. �������ͨ����дequals��������ʽ,�ı�Ƚϵ�����
		 */
		boolean flag= one.equals(two);
		System.out.println("one �� two�����ñȽ� : "+flag);
		System.out.println("one �� two�����ñȽ� : "+(one==two));
		System.out.println("==================================== ");
		String str1=new String("hello");
		String str2=new String("hello");
		flag=str1.equals(str2);
		System.out.println("str1 �� str2�����ñȽ� : "+flag);//String ������д��equals ����,�Ƚϵ����ַ�����ֵ
		System.out.println("str1 �� str2�����ñȽ� : "+(str1==str2));
		System.out.println("==================================== ");
		/*toString
		 *  1. ���������ʱ, Ĭ�ϻ�ֱ�ӵ������е�toString
		 *  2. �̳�Object�е�toString����ʱ,���������ַ�����ʾ��ʽ : ������Ϣ@��ַ��Ϣ 
		 * 
		 */
		System.out.println(one.toString());
		System.out.println(one);
		System.out.println("==================================== ");
		System.out.println(str1);
		
	}

}
