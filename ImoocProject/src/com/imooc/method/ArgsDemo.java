package com.imooc.method;

//可变参数列表
public class ArgsDemo {
	//	对多个int型变量进行求和
	public void sum(int... n) {
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		System.out.println("sum="+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsDemo ad=new ArgsDemo();
		ad.sum(1);
		ad.sum(1,2);
	}

}
