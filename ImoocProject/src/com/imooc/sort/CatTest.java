package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

	public static void main(String[] args) {
		// ��������������
		Cat huahua=new Cat("huahua",5,"Ӣ��");
		Cat fanfan=new Cat("fanfan",2,"�л���԰è");
		
		List<Cat> catList= new ArrayList<Cat>();
		
		catList.add(huahua);
		catList.add(fanfan);
		
		//����ǰ
		System.out.println("����������ǰ:");
		for (Cat cat:catList) {
			System.out.println(cat+" ");
		}
		System.out.println();
		
		//����������
		Collections.sort(catList, new NameComparator());
		
		//�����
		System.out.println("�����������:");
		for (Cat cat:catList) {
			System.out.println(cat+" ");
		}
		System.out.println();
		
		// �����併������
		System.out.println("����������ǰ:");
		for (Cat cat:catList) {
			System.out.println(cat+" ");
		}
		System.out.println();
		
		//�����併������
		Collections.sort(catList, new AgeComparator());
				
		
		//�����
		System.out.println("�����������:");
		for (Cat cat:catList) {
			System.out.println(cat+" ");
		}
		System.out.println();
		
		

	}

}



