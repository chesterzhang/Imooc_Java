package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {

	public static void main(String[] args) {
		// ����Notice��Ķ���
		Notice notice1 = new Notice(1, "��ӭ����Ľ����", "����Ա", new Date());
		Notice notice2 = new Notice(2, "��ͬѧ�ǰ�ʱ����ҵ", "��ʦ", new Date());
		Notice notice3 = new Notice(3, "����֪ͨ", "��ʦ", new Date());

		// ���ӹ���
		ArrayList noticeList = new ArrayList();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);

		// ��ʾ����
		System.out.println("��������Ϊ :");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + " : " + ((Notice) (noticeList.get(i))).getTitle());
		}

		System.out.println("====================================");

		// �ڵ�һ�������������һ���¹���
		Notice notice4 = new Notice(4, "���߱༭������ʹ����", "����Ա", new Date());
		noticeList.add(1, notice4);
		// ��ʾ����
		System.out.println("��������Ϊ :");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + " : " + ((Notice) (noticeList.get(i))).getTitle());
		}
		System.out.println("====================================");

		// ɾ����ʱ�����ҵ�Ĺ���
		noticeList.remove(2);
		// ��ʾ����
		System.out.println("��������Ϊ :");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + " : " + ((Notice) (noticeList.get(i))).getTitle());
		}
		System.out.println("====================================");
		
		//���ڶ�������ĳ�: Java���߱༭������ʹ����
		notice4.setTitle("Java���߱༭������ʹ����");
		noticeList.set(1, notice4);
		System.out.println("��������Ϊ :");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + " : " + ((Notice) (noticeList.get(i))).getTitle());
		}
		System.out.println("====================================");
		
	}

}