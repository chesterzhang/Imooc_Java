package com.imooc.test;

import com.imooc.singleton.SingletonOne;//饿汉模式
import com.imooc.singleton.SingletonTwo;//懒汉模式

public class Test {

	public static void main(String[] args) {
		//私有化构造函数无法访问
		//SingletonOne one=new SingletonOne();
		
		//只能通过共有的静态方法直接获取一个静态实例
		SingletonOne one=SingletonOne.getInstance();
		SingletonOne two=SingletonOne.getInstance();
		System.out.println(one);
		System.out.println(two);
		
		System.out.println("\n=============================================\n");
		
		SingletonTwo one1=SingletonTwo.getInstance();
		SingletonTwo two1=SingletonTwo.getInstance();
		System.out.println(one1);
		System.out.println(two1);

	}

}
