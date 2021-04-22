package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {

	public static void main(String[] args) {
		//实现一个词典
		Map<String,String> animal= new HashMap<String, String>();
		System.out.println("请输入三组单词对应的解释,并存放到HashMap中");
		
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<2) {
			System.out.println("请输入key值 :");
			String key=console.next();
			System.out.println("请输入value值");
			String value=console.next();
			animal.put(key, value);
			i++;
		}
		
		System.out.println("============================");
		//打印输出Map的values, 使用迭代器 
		System.out.println("打印输出Map的values, 使用迭代器 ");
		Iterator<String> it=animal.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("============================");
		//打印输出Map的key和value,通过entrySet方法
		System.out.println("通过entrySet得到key-value :");
		Set<Entry<String,String>> entrySet=animal.entrySet();
		for(Entry<String,String> entry: entrySet) {
			System.out.print(entry.getKey()+" - ");
			System.out.println(entry.getValue());
		}
		
		
		System.out.println("============================");
		//打印输出Map的key和value,通过entrySet方法
		//通过单词找到注释并输出
		//使用KeySet方法
		System.out.println("=请输入要查询的key");
		//打印输出Map的key和value,通过entrySet方法
		String strSearch=console.next();
		//1.取得KeySet
		Set<String> keySet=animal.keySet();
		//2.遍历keySet
		for(String key:keySet) {
			if (strSearch.equals(key)) {
				System.out.println("找到了,键值对为 : "+key+ " - "+animal.get(key));
				break;
			}
		}
		
		

	}

}
