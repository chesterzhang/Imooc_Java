package com.imooc.model;

/**
 * 专业类
 * @author Chester_Zhang
 *
 */
public class Subject {
	// 成员属性:学科名称,学科编号,学制年限,选修本专业的学生信息,选修本专业的学生个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;

	// 无参构造
	public Subject() {

	}

	// 带参构造
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	
	// 带参构造
		public Subject(String subjectName, String subjectNo, int subjectLife,Student[] myStudents) {
			this.setSubjectName(subjectName);
			this.setSubjectNo(subjectNo);
			this.setSubjectLife(subjectLife);
			this.setMyStudents(myStudents);
		}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectNo() {
		return this.subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return this.subjectLife;
	}

	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}

	public String getSubjectName() {
		return this.subjectName;
	}
	
	/**
	 * 获取选修专业的学生信息
	 * @return 学生信息数组
	 */
	public Student[] getMyStudents() {
		if(this.myStudents==null) {
			this.myStudents=new Student[200];//数组初始化必须有第一个维度
		}
		return this.myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}

	public int getStudentNum() {
		return this.studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 * 专业介绍方法
	 * @return 专业介绍的相关信息,包括名称,编号,年薪
	 */
	
	public String info() {
		String str = "专业信息如下:\n专业名称 : " + this.getSubjectName() + "\n专业编号 : " + this.getSubjectNo() + 
				"\n专业年限 : "+ this.getSubjectLife();
		return str;
	}
	
	
	public void addStudent(Student stu) {
		for(int i=0;i<this.getMyStudents().length;i++) {
			if(this.getMyStudents()[i]==null) {
				this.getMyStudents()[i]=stu;
				this.studentNum=i+1;
				return;
			}
			
		}
	}

}

