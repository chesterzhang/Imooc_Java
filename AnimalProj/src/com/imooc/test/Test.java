package com.imooc.test;

import com.imooc.Animal.Animal;
import com.imooc.Animal.Cat;
import com.imooc.Animal.Dog;

public class Test {

	public static void main(String[] args) {
		Cat one =new Cat();
		one.setName("����");
		one.setSpecies("�л���԰è");
		one.eat();
		one.run();
		
		System.out.println("\n===========================================\n");
		
		Dog two= new Dog();
		two.setName("��");
		two.setMonth(1);
		two.eat();
		two.sleep();
		
		System.out.println("\n===========================================\n");
		Animal three=new Animal();
 
		
	}

}
