package com.imooc.tel;

public class SmartWatch implements INet, Iphoto{
	
	public void call() {
		System.out.println("智能手表可以打电话");
	}
	
	public void message() {
		System.out.println("智能手表可以发短信");
	}
	
	public void network() {
		System.out.println("智能手表可以可以上网");
	}

	@Override
	public void newtork() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connection() {
		 
		INet.super.connection();//默认调用接口中的方法
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
