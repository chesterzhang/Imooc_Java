package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WorldDemo {

	public static void main(String[] args) {
		// ��Ӣ�ĵ�����ӵ�HashSet��
		Set set = new HashSet();

		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");

		
		// �õ������������Ԫ��
		System.out.println("������Ԫ��Ϊ:");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// �ڼ����в�����Ԫ��
		set.add("green");
		set.add("white");//�ظ�Ԫ��
		// �õ������������Ԫ��
		it = set.iterator();
		System.out.println("������Ԫ��Ϊ:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
