package com.imooc.model;

public class Student {
	//成员特征: 学号,姓名,性别,年龄,专业
	private String studentNo;
	private String studentName;
	private String studentGender;
	private int studentAge;
	private Subject studentSubject;
	
	
	//无参构造
	public Student() {
 
	}
	
	//多参构造,实现对全部属性的赋值
	public Student(String studentNo, String studentName, String studentGender, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentGender(studentGender);
		this.setStudentAge(studentAge);
	}
	
	//多参构造,实现对全部属性的赋值,传入一个类来实例化另一个类
		public Student(String studentNo, String studentName, String studentGender, int studentAge,Subject studentSubject) {
			this.setStudentNo(studentNo);
			this.setStudentName(studentName);
			this.setStudentGender(studentGender);
			this.setStudentAge(studentAge);
			this.setStudentSubject(studentSubject);
		}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentGender() {
		return this.studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public int getStudentAge() {
		return this.studentAge;
	}

	public void setStudentAge(int studentAge) {
		if (studentAge<10 || studentAge>100) {
			this.studentAge=18;
		}else {
			this.studentAge = studentAge;
		}
	}

	public String getStudentNo() {
		return this.studentNo;
	}
	
	/**
	 * 获取专业对象,如果没有实例化,先实例化后再返回
	 * @return 专业对象信息
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject==null) {
			this.studentSubject=new Subject();
		}
		return this.studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	/**
	 * 学生自我介绍方法
	 * @return 学生自我介绍信息 : 姓名, 学号, 性别, 年龄
	 */
	public String introduction() {
		String str="学生信息如下 :\n"+this.getStudentName()+"\n学号 :"+this.getStudentNo()+
				"\n性别 : "+this.getStudentGender()+"年龄 : "+this.getStudentAge()+"\n专业名称 : "+this.getStudentSubject().getSubjectName()+
				"\n专业年限 : "+this.getStudentSubject().getSubjectLife();
		return str;
	}
	
	/**
	 * 学生自我介绍方法
	 * @param subjectName
	 * @param subjectLife
	 * @return 学生自我介绍信息 : 姓名, 学号, 性别, 年龄, 所学专业, 专业年限
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str="学生信息如下 :\n"+this.getStudentName()+"\n学号 :"+this.getStudentNo()+
				"\n性别 : "+this.getStudentGender()+"年龄 : "+this.getStudentAge()+"\n专业名称 : "+subjectName
				+"\n专业年限 : "+subjectLife;
		return str;
	}
	
	/**
	 * 学生自我介绍方法
	 * @param mySubject Subject对象
	 * @return 学生自我介绍信息 : 姓名, 学号, 性别, 年龄, 所学专业, 专业年限
	 */
	public String introduction(Subject mySubject) {
		String str="学生信息如下 :\n"+this.getStudentName()+"\n学号 :"+this.getStudentNo()+
				"\n性别 : "+this.getStudentGender()+"年龄 : "+this.getStudentAge()+"\n专业名称 : "+mySubject.getSubjectName()
				+"\n专业年限 : "+mySubject.getSubjectLife();
		return str;
	}
	
}







