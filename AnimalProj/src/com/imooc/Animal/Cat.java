package com.imooc.Animal;

public class Cat extends Animal {
	private double weight;
	 
	
	static {
		System.out.println("我是子类静态代码块");
	}
	
	{
		System.out.println("我是子类构造代码块");
	}
	
	public Cat() {
		System.out.println("我是子类构造方法");
	}
	
	public Cat(String name, int month ) {
		//子类构造默认调用父类的无参构造方法
		//可以通过super()调用父类允许被访问的带参构造
		//super()必须放在第一行
		super(name,month);
		System.out.println("我是子类带参构造方法");
	}
	

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//跑动
	public void run() {
		System.out.println(this.getName()+"是一只"+this.getSpecies()+"在快乐的奔跑 !");
	}
	
}
