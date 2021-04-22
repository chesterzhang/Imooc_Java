package com.imooc.test;

//自定义异常类
public class HotelAgeException extends Exception{

	public HotelAgeException() {
		super("18岁以下,80岁以上的住客必须有亲友陪同");
	}

}
