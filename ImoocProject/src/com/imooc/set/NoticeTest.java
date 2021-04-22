package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {

	public static void main(String[] args) {
		// 创建Notice类的对象
		Notice notice1 = new Notice(1, "欢迎来到慕课网", "管理员", new Date());
		Notice notice2 = new Notice(2, "请同学们按时交作业", "老师", new Date());
		Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

		// 添加公告
		ArrayList noticeList = new ArrayList();
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);

		// 显示公告
		System.out.println("公告内容为 :");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + " : " + ((Notice) (noticeList.get(i))).getTitle());
		}

		System.out.println("====================================");

		// 在第一条公告后面添加一条新公告
		Notice notice4 = new Notice(4, "在线编辑器可以使用了", "管理员", new Date());
		noticeList.add(1, notice4);
		// 显示公告
		System.out.println("公告内容为 :");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + " : " + ((Notice) (noticeList.get(i))).getTitle());
		}
		System.out.println("====================================");

		// 删除按时完成作业的公告
		noticeList.remove(2);
		// 显示公告
		System.out.println("公告内容为 :");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + " : " + ((Notice) (noticeList.get(i))).getTitle());
		}
		System.out.println("====================================");
		
		//将第二条公告改成: Java在线编辑器可以使用了
		notice4.setTitle("Java在线编辑器可以使用了");
		noticeList.set(1, notice4);
		System.out.println("公告内容为 :");
		for (int i = 0; i < noticeList.size(); i++) {
			System.out.println(i + 1 + " : " + ((Notice) (noticeList.get(i))).getTitle());
		}
		System.out.println("====================================");
		
	}

}
