package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

	public static void main(String[] args) {
		// 按名字升序排序
		Cat huahua=new Cat("huahua",5,"英短");
		Cat fanfan=new Cat("fanfan",2,"中华田园猫");
		
		List<Cat> catList= new ArrayList<Cat>();
		
		catList.add(huahua);
		catList.add(fanfan);
		
		//排序前
		System.out.println("按名字排序前:");
		for (Cat cat:catList) {
			System.out.println(cat+" ");
		}
		System.out.println();
		
		//按名字排序
		Collections.sort(catList, new NameComparator());
		
		//排序后
		System.out.println("按名字排序后:");
		for (Cat cat:catList) {
			System.out.println(cat+" ");
		}
		System.out.println();
		
		// 按年龄降序排序
		System.out.println("按年龄排序前:");
		for (Cat cat:catList) {
			System.out.println(cat+" ");
		}
		System.out.println();
		
		//按年龄降序排序
		Collections.sort(catList, new AgeComparator());
				
		
		//排序后
		System.out.println("按名字排序后:");
		for (Cat cat:catList) {
			System.out.println(cat+" ");
		}
		System.out.println();
		
		

	}

}



