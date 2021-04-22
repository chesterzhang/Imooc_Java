package com.imooc.test;
//用来学习所有类的老祖宗Object中的equals()方法

import com.imooc.Animal.Animal;

public class Test3 {

	public static void main(String[] args) {
		Animal one=new Animal("花花",2);
		Animal two=new Animal("花花",2);
		
		/*
		 * equals方法测试
		 * 1. 继承Object中的equals方法时,比较的是两个引用是否指向一个对象
		 * 2. 子类可以通过重写equals方法的形式,改变比较的内容
		 */
		boolean flag= one.equals(two);
		System.out.println("one 和 two的引用比较 : "+flag);
		System.out.println("one 和 two的引用比较 : "+(one==two));
		System.out.println("==================================== ");
		String str1=new String("hello");
		String str2=new String("hello");
		flag=str1.equals(str2);
		System.out.println("str1 和 str2的引用比较 : "+flag);//String 类型重写了equals 方法,比较的是字符串的值
		System.out.println("str1 和 str2的引用比较 : "+(str1==str2));
		System.out.println("==================================== ");
		/*toString
		 *  1. 输出对象名时, 默认会直接调用类中的toString
		 *  2. 继承Object中的toString方法时,输出对象的字符串表示形式 : 类型信息@地址信息 
		 * 
		 */
		System.out.println(one.toString());
		System.out.println(one);
		System.out.println("==================================== ");
		System.out.println(str1);
		
	}

}
