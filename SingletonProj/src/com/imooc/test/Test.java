package com.imooc.test;

import com.imooc.singleton.SingletonOne;//����ģʽ
import com.imooc.singleton.SingletonTwo;//����ģʽ

public class Test {

	public static void main(String[] args) {
		//˽�л����캯���޷�����
		//SingletonOne one=new SingletonOne();
		
		//ֻ��ͨ�����еľ�̬����ֱ�ӻ�ȡһ����̬ʵ��
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
