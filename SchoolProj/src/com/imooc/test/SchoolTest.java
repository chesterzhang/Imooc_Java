package com.imooc.test;
import com.imooc.model.Subject;
import com.imooc.model.Student;


public class SchoolTest {

	public static void main(String[] args) {
		// 测试Subject
		Subject sub1=new Subject("计算机科学与应用","J0001",4);
		System.out.println(sub1.info());
		
		System.out.println("\n====================================\n");
		
		//测试student
		Student stu1=new Student("S01","张三","男",18,sub1);
		System.out.println(stu1.introduction());
		
		System.out.println("\n====================================\n");
		
		Student stu2=new Student("S02","李四","女",17);
		System.out.println(stu2.introduction("计算机科学与应用", 4));
		
		System.out.println("\n====================================\n");
		Student stu3=new Student("S03","王五","男",18);
		System.out.println(stu3.introduction(sub1));
		
		System.out.println("\n====================================\n");
		//测试指定专业有多少学生报名
		sub1.addStudent(stu1);
		sub1.addStudent(stu2);
		sub1.addStudent(stu3);
		System.out.println(sub1.getSubjectName()+"的专业中已有"+sub1.getStudentNum()+"个学生");
	}

	
}




