package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {

	public static void main(String[] args) {
		//ʵ��һ���ʵ�
		Map<String,String> animal= new HashMap<String, String>();
		System.out.println("���������鵥�ʶ�Ӧ�Ľ���,����ŵ�HashMap��");
		
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<2) {
			System.out.println("������keyֵ :");
			String key=console.next();
			System.out.println("������valueֵ");
			String value=console.next();
			animal.put(key, value);
			i++;
		}
		
		System.out.println("============================");
		//��ӡ���Map��values, ʹ�õ����� 
		System.out.println("��ӡ���Map��values, ʹ�õ����� ");
		Iterator<String> it=animal.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("============================");
		//��ӡ���Map��key��value,ͨ��entrySet����
		System.out.println("ͨ��entrySet�õ�key-value :");
		Set<Entry<String,String>> entrySet=animal.entrySet();
		for(Entry<String,String> entry: entrySet) {
			System.out.print(entry.getKey()+" - ");
			System.out.println(entry.getValue());
		}
		
		
		System.out.println("============================");
		//��ӡ���Map��key��value,ͨ��entrySet����
		//ͨ�������ҵ�ע�Ͳ����
		//ʹ��KeySet����
		System.out.println("=������Ҫ��ѯ��key");
		//��ӡ���Map��key��value,ͨ��entrySet����
		String strSearch=console.next();
		//1.ȡ��KeySet
		Set<String> keySet=animal.keySet();
		//2.����keySet
		for(String key:keySet) {
			if (strSearch.equals(key)) {
				System.out.println("�ҵ���,��ֵ��Ϊ : "+key+ " - "+animal.get(key));
				break;
			}
		}
		
		

	}

}
