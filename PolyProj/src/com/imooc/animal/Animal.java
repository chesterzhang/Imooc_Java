package com.imooc.animal;

// 设置一个类为抽象类, 无法被直接实例化,可以通过实例化子类，然后向上转型
public abstract   class Animal {
	private String name;
	private int month;
	
	public Animal() {
		
	}
	
	public Animal(String name, int month) {
		this.setName(name);
		this.setMonth(month);
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	//吃东西, 抽象方法必须定义在抽象类里面，不允许有方法体，子类必须重写
	public abstract void eat();

	
}
