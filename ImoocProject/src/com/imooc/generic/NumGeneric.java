package com.imooc.generic;


//自定义泛型类

public class NumGeneric <T >{
	private T num;

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}
 
	public static void main(String[] args) {
		NumGeneric<Integer> intNum=new NumGeneric<Integer>();
		intNum.setNum(10);
		System.out.println("Integer : "+ intNum.getNum());
		
		NumGeneric<Float> floatNum=new NumGeneric<Float>();
		floatNum.setNum( 10.0f);//必须加f, 否则报错
		System.out.println("Float : "+ floatNum.getNum());
		
	}
	
	
	
}
