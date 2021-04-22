package com.imooc.set;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// 用ArrayList存储编程语言的名称,并输出
		List list=new ArrayList();	
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("Swift");

		//输出列表中元素个数
		System.out.println("列表中元素个数为 : "+list.size());
		
		System.out.println("==============================");
		
		//遍历set元素
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+ " ");
		}
		
		
		//移除列表中的C++
		System.out.println();
		//list.remove(2);
		list.remove("C++");
		System.out.println("==============================");
		System.out.println("移除列表中C++以后的元素为:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+ " ");
		}
		
	}

}



