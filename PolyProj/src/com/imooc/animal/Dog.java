package com.imooc.animal;

public class Dog extends Animal{
	//�����Ա�
	private String gender;
	
	public Dog() {
		
	}
	public Dog(String name ,int month, String gender) {
		super(name,month);
		this.setGender(gender);
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	
	
	//������˯��
	public void sleep() {
		System.out.println("С��˯������")	;
	}
	
	
	//����:�Զ���(��д����)
	@Override
	public void eat() {
		System.out.println("��������⣡")	;
	}
	
	
}









