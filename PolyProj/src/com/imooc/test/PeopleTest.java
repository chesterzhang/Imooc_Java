package com.imooc.test;

import com.imooc.people.Person;
import com.imooc.people.Person.Heart;

public class PeopleTest {
	
	public static void main(String[] args) {
		Person  lili =new Person();
		 
		/*
		//访问内部类 方法一: new 外部类().new 内部类()
		Person.Heart myHeart =new Person().new Heart();
		System.out.println(myHeart.beat());
		
		//访问内部类 方法二:  外部类对象.new 内部类()
		myHeart=lili.new Heart();
		System.out.println(myHeart.beat());
		
		//访问内部类 方法三:  外部类对象.get内部类
		myHeart=lili.getHeart();
		System.out.println(myHeart.beat());
		*/
		
		//获取静态内部类对象实例
		Person.Heart myHeart=new Person.Heart();
		System.out.println(myHeart.beat());
			
	}
}


