package com.imooc.animal;

public class Dog extends Animal{
	//属性性别
	private String gender;
	
	public Dog() {
		
	}
	public Dog(String name ,int month, String gender) {
		super(name,month);
		this.setGender(gender);
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	
	
	//方法：睡觉
	public void sleep() {
		System.out.println("小狗睡觉觉！")	;
	}
	
	
	//方法:吃东西(重写父类)
	@Override
	public void eat() {
		System.out.println("狗狗会吃肉！")	;
	}
	
	
}









