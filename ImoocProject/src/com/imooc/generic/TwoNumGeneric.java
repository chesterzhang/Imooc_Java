package com.imooc.generic;

//·ºÐÍ
public class TwoNumGeneric<T,X>{
	
	private T num1;
	private X num2;
	 
	 
	 
	public T getNum1() {
		return num1;
	}

	public void setNum1(T num1) {
		this.num1 = num1;
	}

	public X getNum2() {
		return num2;
	}

	public void setNum2(X num2) {
		this.num2 = num2;
	}

	public static void main(String[] args) {
		 TwoNumGeneric<Integer , Float> numObj= new TwoNumGeneric<>();
		 numObj.setNum1(25);
		 numObj.setNum2(5.0f);
		 
		 System.out.println("Num1 : "+ numObj.getNum1());
		 System.out.println("Num2 : "+ numObj.getNum2());

	}

}
