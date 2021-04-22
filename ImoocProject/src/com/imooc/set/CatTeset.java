package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTeset {

	public static void main(String[] args) {
		// 实例化Cat对象
		Cat huahua=new Cat("花花",12,"英短");
		Cat fanfan=new Cat("凡凡",3,"中华田园猫");
		
		//将Cat对象加入到HashSet中
		Set<Cat>  set=new HashSet<Cat>();
		set.add(huahua);
		set.add(fanfan);
		
		//用迭代器遍历set
		Iterator<Cat> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//再添加一个与花花属性一样的猫
		Cat huahua01=new Cat("花花",12,"英短");
		set.add(huahua01);
		System.out.println("============================");
		System.out.println("添加重复数据后的宠物猫信息");
		//用迭代器遍历set
		it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("============================");
		//再添加花花二代
		Cat huahua02=new Cat("花花二代",2,"英短");
		set.add(huahua02);
		System.out.println("添加花花二代后的宠物猫信息");
		//用迭代器遍历set
		it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("============================");
		//在集合中查找花花的信息并输出
		if(set.contains(huahua)) {
			System.out.println("花花找到了");
		}else {
			System.out.println("花花没找到");
		}
		
		
		//在集合中使用名字查找花花的信息
		it=set.iterator();
		boolean flag=false;
		while(it.hasNext()) {
			Cat c=it.next();
			if (c.getName().equals("花花")) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("花花找到了");
		}else {
			System.out.println("花花没找到");
		}
		
		System.out.println("============================");
		
		//删除花花二代
		for(Cat cat:set) {
			if("花花二代".equals(cat.getName())) {
				set.remove(cat);
				break;
			}
		}
		
		System.out.println("删除花花二代后的数据");
		for(Cat cat:set) {
			System.out.println(cat);
		}
		
		System.out.println("============================");
		//删除所有年龄小于5个月的猫猫
		//这里不能直接在集合中删除,否则迭代器找不到next(),直接报错
		Set<Cat> set1=new HashSet<Cat>();
		for(Cat cat:set) {
			if (cat.getMonth()<5) {
				set1.add(cat);
			}
		}
		set.removeAll(set1);
		System.out.println("删除所有年龄小于5个月的猫猫");
		it=set.iterator();
		while(it.hasNext()) {
			Cat c=it.next();
			System.out.println(c);
		}
		
		
		System.out.println("============================");
		//删除集合中所有元素
		boolean flag1=set.removeAll(set);
		if (set.isEmpty()) {
			System.out.println("猫猫都不见了");
		}else {
			System.out.println("猫猫还在");
		}
		
	}

}



