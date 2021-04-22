package com.imooc.model;

/**
 * רҵ��
 * @author Chester_Zhang
 *
 */
public class Subject {
	// ��Ա����:ѧ������,ѧ�Ʊ��,ѧ������,ѡ�ޱ�רҵ��ѧ����Ϣ,ѡ�ޱ�רҵ��ѧ������
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;

	// �޲ι���
	public Subject() {

	}

	// ���ι���
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	
	// ���ι���
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
	 * ��ȡѡ��רҵ��ѧ����Ϣ
	 * @return ѧ����Ϣ����
	 */
	public Student[] getMyStudents() {
		if(this.myStudents==null) {
			this.myStudents=new Student[200];//�����ʼ�������е�һ��ά��
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
	 * רҵ���ܷ���
	 * @return רҵ���ܵ������Ϣ,��������,���,��н
	 */
	
	public String info() {
		String str = "רҵ��Ϣ����:\nרҵ���� : " + this.getSubjectName() + "\nרҵ��� : " + this.getSubjectNo() + 
				"\nרҵ���� : "+ this.getSubjectLife();
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

