package com.imooc.test;

import com.imooc.people.Person;
import com.imooc.people.Person.Heart;

public class PeopleTest {
	
	public static void main(String[] args) {
		Person  lili =new Person();
		 
		/*
		//�����ڲ��� ����һ: new �ⲿ��().new �ڲ���()
		Person.Heart myHeart =new Person().new Heart();
		System.out.println(myHeart.beat());
		
		//�����ڲ��� ������:  �ⲿ�����.new �ڲ���()
		myHeart=lili.new Heart();
		System.out.println(myHeart.beat());
		
		//�����ڲ��� ������:  �ⲿ�����.get�ڲ���
		myHeart=lili.getHeart();
		System.out.println(myHeart.beat());
		*/
		
		//��ȡ��̬�ڲ������ʵ��
		Person.Heart myHeart=new Person.Heart();
		System.out.println(myHeart.beat());
			
	}
}


