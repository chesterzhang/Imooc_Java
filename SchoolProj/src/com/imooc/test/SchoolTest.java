package com.imooc.test;
import com.imooc.model.Subject;
import com.imooc.model.Student;


public class SchoolTest {

	public static void main(String[] args) {
		// ����Subject
		Subject sub1=new Subject("�������ѧ��Ӧ��","J0001",4);
		System.out.println(sub1.info());
		
		System.out.println("\n====================================\n");
		
		//����student
		Student stu1=new Student("S01","����","��",18,sub1);
		System.out.println(stu1.introduction());
		
		System.out.println("\n====================================\n");
		
		Student stu2=new Student("S02","����","Ů",17);
		System.out.println(stu2.introduction("�������ѧ��Ӧ��", 4));
		
		System.out.println("\n====================================\n");
		Student stu3=new Student("S03","����","��",18);
		System.out.println(stu3.introduction(sub1));
		
		System.out.println("\n====================================\n");
		//����ָ��רҵ�ж���ѧ������
		sub1.addStudent(stu1);
		sub1.addStudent(stu2);
		sub1.addStudent(stu3);
		System.out.println(sub1.getSubjectName()+"��רҵ������"+sub1.getStudentNum()+"��ѧ��");
	}

	
}




