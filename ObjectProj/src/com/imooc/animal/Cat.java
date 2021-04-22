package com.imooc.animal;
/**
 * 宠物猫类
 * @author Chester_Zhang
 *
 */

public class Cat {
	//成员属性:昵称, 年龄, 体重, 品种
	private String name; //默认null
	private int month;//默认0
	private double weight;//默认0.0
	private String species;//默认null
	
	//static: 静态成员, 也称类成员, 无论类实例化多少个对象, 都共用同一块静态空间
	public static int price;//价格
	
	//静态代码块先于构造代码块执行,且无论多少个对象,只会执行一次
	static {
		price=200;
	}
	
	//无参构造函数
	public Cat() {
		//System.out.println("我是无参构造函数！");
		System.out.println("我是宠物猫！");
	}
	
	//构造函数重载
	public Cat(String name, int month, double weight, String species) {
		this.setName(name);
		this.setMonth(month);
		this.setWeight(weight);
		this.setSpecies(species);
	 
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return "我是"+this.name+"!";
	}

	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month<=0) {
			System.out.println("输入信息错误, 猫猫年龄必须大于0！");
		}else {
			this.month = month;
		}
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	//方法:跑动
	public void run() {
		System.out.println("小猫快跑 ！");
	}
	
	//方法跑动重载
	public void run(String name) {
		System.out.println(name+"快跑 ！");
	}

	//方法: 吃东西
	//static 方法 , 类方法, 静态方法
	public static void eat() {
			System.out.println("小猫吃鱼 ！");
		}
		
}
