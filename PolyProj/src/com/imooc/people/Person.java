package com.imooc.people;
//外部类
public class Person {
	public int age;
	
	public Heart getHeart() {
		return new Heart();
	}
	
	public void eat() {
		System.out.println("人会吃东西");
	}
	
	//内部类
/*
	class Heart {
		public String beat() {
			eat();
			return age+"岁的心脏在跳动";
		}
	}
*/
	
	//静态内部类
	/*
	 * 1.静态内部类中,只能直接访问外部类的静态成员法, 若想要调用非静态成员需要通过外部对象实例
	 * 2.静态内部类对象实例时,可以不依赖于外部类对象
	 * 3.可以通过外部类.内部类.静态成员的方实,访问内部类中的静态成员
	 * 4.当内部类属性与外部类属性同名时,默认直接调用内部类中的成员;若要访问外部类中的静态属性，则
	 * 通过外部类.属性的方实
	 * 若要访问外部类中的非静态属性, 在可以通过 new外部类().属性的方式
	 */
	
	public static class Heart {
		public String beat() {
			// eat(); 只有静态
			return new Person().age+"岁的心脏在跳动";
		}
	}
	
	
	

}
