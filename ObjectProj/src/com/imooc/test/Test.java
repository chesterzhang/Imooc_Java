package com.imooc.test;//定义包
//import com.imooc.animal.*; //加载一个包下面的所有类
import com.imooc.animal.Cat;//加载一个包下面的一个类
//import com.imooc.mechanics.*;//加载一个包下面的所有类


public class Test {

	public static void main(String[] args) {
		//import多个重名包需要指定package
		//com.imooc.animal.Cat  cat=new com.imooc.animal.Cat();
	
		//直接加载com.imooc.animal.CatTest类
		//com.imooc.animal.CatTest  tex=new com.imooc.animal.CatTest();

		Cat one=new Cat();
		one.setName("花花");
		one.setMonth(2);
		one.setSpecies("英短");
		one.price=2000;
		Cat.price=3000;//推荐使用类名访问
		
		//Cat two=new Cat();
		//two.setName("凡凡");
		//two.setMonth(1);
		//two.setSpecies("中华田园猫");
		//two.price=150;
		
		System.out.println(one.getName()+" 我的售价"+one.price);
		//System.out.println(two.getName()+" 我的售价"+two.price);
		
		
	}

}
