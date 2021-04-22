package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTeset {

	public static void main(String[] args) {
		// ʵ����Cat����
		Cat huahua=new Cat("����",12,"Ӣ��");
		Cat fanfan=new Cat("����",3,"�л���԰è");
		
		//��Cat������뵽HashSet��
		Set<Cat>  set=new HashSet<Cat>();
		set.add(huahua);
		set.add(fanfan);
		
		//�õ���������set
		Iterator<Cat> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//�����һ���뻨������һ����è
		Cat huahua01=new Cat("����",12,"Ӣ��");
		set.add(huahua01);
		System.out.println("============================");
		System.out.println("����ظ����ݺ�ĳ���è��Ϣ");
		//�õ���������set
		it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("============================");
		//����ӻ�������
		Cat huahua02=new Cat("��������",2,"Ӣ��");
		set.add(huahua02);
		System.out.println("��ӻ���������ĳ���è��Ϣ");
		//�õ���������set
		it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("============================");
		//�ڼ����в��һ�������Ϣ�����
		if(set.contains(huahua)) {
			System.out.println("�����ҵ���");
		}else {
			System.out.println("����û�ҵ�");
		}
		
		
		//�ڼ�����ʹ�����ֲ��һ�������Ϣ
		it=set.iterator();
		boolean flag=false;
		while(it.hasNext()) {
			Cat c=it.next();
			if (c.getName().equals("����")) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("�����ҵ���");
		}else {
			System.out.println("����û�ҵ�");
		}
		
		System.out.println("============================");
		
		//ɾ����������
		for(Cat cat:set) {
			if("��������".equals(cat.getName())) {
				set.remove(cat);
				break;
			}
		}
		
		System.out.println("ɾ�����������������");
		for(Cat cat:set) {
			System.out.println(cat);
		}
		
		System.out.println("============================");
		//ɾ����������С��5���µ�èè
		//���ﲻ��ֱ���ڼ�����ɾ��,����������Ҳ���next(),ֱ�ӱ���
		Set<Cat> set1=new HashSet<Cat>();
		for(Cat cat:set) {
			if (cat.getMonth()<5) {
				set1.add(cat);
			}
		}
		set.removeAll(set1);
		System.out.println("ɾ����������С��5���µ�èè");
		it=set.iterator();
		while(it.hasNext()) {
			Cat c=it.next();
			System.out.println(c);
		}
		
		
		System.out.println("============================");
		//ɾ������������Ԫ��
		boolean flag1=set.removeAll(set);
		if (set.isEmpty()) {
			System.out.println("èè��������");
		}else {
			System.out.println("èè����");
		}
		
	}

}



