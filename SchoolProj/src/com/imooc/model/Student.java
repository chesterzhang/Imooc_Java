package com.imooc.model;

public class Student {
	//��Ա����: ѧ��,����,�Ա�,����,רҵ
	private String studentNo;
	private String studentName;
	private String studentGender;
	private int studentAge;
	private Subject studentSubject;
	
	
	//�޲ι���
	public Student() {
 
	}
	
	//��ι���,ʵ�ֶ�ȫ�����Եĸ�ֵ
	public Student(String studentNo, String studentName, String studentGender, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentGender(studentGender);
		this.setStudentAge(studentAge);
	}
	
	//��ι���,ʵ�ֶ�ȫ�����Եĸ�ֵ,����һ������ʵ������һ����
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
	 * ��ȡרҵ����,���û��ʵ����,��ʵ�������ٷ���
	 * @return רҵ������Ϣ
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
	 * ѧ�����ҽ��ܷ���
	 * @return ѧ�����ҽ�����Ϣ : ����, ѧ��, �Ա�, ����
	 */
	public String introduction() {
		String str="ѧ����Ϣ���� :\n"+this.getStudentName()+"\nѧ�� :"+this.getStudentNo()+
				"\n�Ա� : "+this.getStudentGender()+"���� : "+this.getStudentAge()+"\nרҵ���� : "+this.getStudentSubject().getSubjectName()+
				"\nרҵ���� : "+this.getStudentSubject().getSubjectLife();
		return str;
	}
	
	/**
	 * ѧ�����ҽ��ܷ���
	 * @param subjectName
	 * @param subjectLife
	 * @return ѧ�����ҽ�����Ϣ : ����, ѧ��, �Ա�, ����, ��ѧרҵ, רҵ����
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str="ѧ����Ϣ���� :\n"+this.getStudentName()+"\nѧ�� :"+this.getStudentNo()+
				"\n�Ա� : "+this.getStudentGender()+"���� : "+this.getStudentAge()+"\nרҵ���� : "+subjectName
				+"\nרҵ���� : "+subjectLife;
		return str;
	}
	
	/**
	 * ѧ�����ҽ��ܷ���
	 * @param mySubject Subject����
	 * @return ѧ�����ҽ�����Ϣ : ����, ѧ��, �Ա�, ����, ��ѧרҵ, רҵ����
	 */
	public String introduction(Subject mySubject) {
		String str="ѧ����Ϣ���� :\n"+this.getStudentName()+"\nѧ�� :"+this.getStudentNo()+
				"\n�Ա� : "+this.getStudentGender()+"���� : "+this.getStudentAge()+"\nרҵ���� : "+mySubject.getSubjectName()
				+"\nרҵ���� : "+mySubject.getSubjectLife();
		return str;
	}
	
}







