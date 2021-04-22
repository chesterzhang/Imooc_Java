package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;
import com.imooc.animal.Master;

public class MasterTest {

	public static void main(String[] args) {
		Master master = new Master();
		Cat one=new Cat();
		Dog two=new Dog();
		master.feed(one);
		master.feed(two); 
		
		System.out.println("\n===================================\n");
		
		boolean isMuchTime=true;
		Animal animal;
		if (isMuchTime) {
			animal=master.hasMuchTime();
		}else {
			animal=master.hasLittleTime();
		}
		System.out.println(animal);
		
		System.out.println("\n===================================\n");
		
		animal=master.raisePet(isMuchTime);
		System.out.println(animal);
		
	}

}
