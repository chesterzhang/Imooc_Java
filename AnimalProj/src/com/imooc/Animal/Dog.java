package com.imooc.Animal;

public class Dog extends Animal {
	private String gender;
	 
	public Dog() {
		
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}

	//睡觉的方法
	public void sleep() {
		System.out.println(this.getName()+this.getMonth()+"个月大了, "+"现在在睡觉 !");
	}
	
	//睡觉方法重载
	private String sleep(String name) {
		return "";
	}
	
	//吃东西方法重写
	@Override
	public void eat() {
		System.out.println(this.getName()+"吃骨头");
	}
 

}











