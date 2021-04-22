package com.imooc.animal;
 

public class Master {
	/*
	 * 喂宠物
	 * 喂猫猫 : 猫猫吃完东西去玩线球
	 * 喂狗狗 : 狗狗吃完去睡觉觉
	 */
	
	//方案1, 指定参数类型
	public void feed(Cat cat) {
		cat.eat();
		cat.playball();	
	}
	
	public void feed(Dog dog) {
		dog.eat();
		dog.sleep();
	}
	
	//方案2: 传入父类, 进行类型转换,转换成子类
	public void feed(Animal obj) {
		if (obj instanceof Cat ) {
			Cat temp= (Cat)obj;
			temp.eat();
			temp.playball();	
		}else if (obj instanceof Dog ) {
			Dog temp= (Dog)obj;
			temp.eat();
			temp.sleep();
		}
		
	}
	
	/*
	 * 饲养何种宠物
	 * 空闲时间多: 养狗狗
	 * 空闲时间少:养猫猫
	 */
	// 方案1
	public Dog hasMuchTime() {
		System.out.println("主人有很多时间, 适合养狗狗.");
		return new Dog();
	}
	
	public Cat hasLittleTime() {
		System.out.println("主人没有很多时间, 适合养狗狗.");
		return new Cat();
	}
	
	// 方案2
	public Animal raisePet(boolean hasMuchTime) {
		if (hasMuchTime) {
			System.out.println("主人有很多时间, 适合养狗狗.");
			return new Dog();
		}else {
			System.out.println("主人没有很多时间, 适合养狗狗.");
			return new Cat();
		}
	}

}
