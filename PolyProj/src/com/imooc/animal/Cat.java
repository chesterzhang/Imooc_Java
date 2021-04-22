package com.imooc.animal;

public class Cat extends Animal {
	//独立属性: 体重
	private double weight;
	
	public Cat() {
		
	}
	
	public Cat(String name, int month, double weight) {
		super(name,month);
		this.setWeight(weight);
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	//独立方法:跑动
	public void run() {
		System.out.println("猫猫会跑!");
	}
	
	//重写吃东西
	@Override
	public void eat() {
		System.out.println("猫猫会吃鱼!");
	}

	public void playball() {
		System.out.println("猫猫玩线球!");
		
	}
	
	
}
