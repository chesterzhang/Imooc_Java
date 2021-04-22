package com.imooc.test;
//展示多态
import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		//Animal one=new Animal(); 抽象类无法直接实例化,只能通过子类向上转型
		
		//向上转型,自动转型,子类向父类转型
		//子类所特有的方法无法调用,可以到平庸子类重写父类的方法以及父类方法
		
		Animal two=new Cat();
		Animal three=new Dog();
		System.out.println(two);//输出仍然是 Cat类
		System.out.println(three);//输出仍然是Dog类
		 
		two.eat();
		three.eat();
		
		System.out.println("\n===========================================\n");
		//向下转型, 强制类型转换
		//父类转向子类, 必须使用强转换
		// a instanceof b : 判断a是否是b的实例
		if (two instanceof Cat) {
			Cat temp=(Cat) two;
			temp.eat();
			temp.run();
		}
		
		if (two instanceof Dog) {
			Dog temp2=(Dog) two; //一个子类不能转换成另一个子类
			temp2.eat();
			temp2.sleep();
		}
		
		System.out.println("\n===========================================\n");
		
		if (two instanceof Animal) {
			System.out.println("two 是 Animal的实例");
		}
		
		
		
		

	}

}
