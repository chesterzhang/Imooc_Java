package com.imooc.Animal;

public class Dog extends Animal {
	private String gender;
	 
	public Dog() {
		
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}

	//˯���ķ���
	public void sleep() {
		System.out.println(this.getName()+this.getMonth()+"���´���, "+"������˯�� !");
	}
	
	//˯����������
	private String sleep(String name) {
		return "";
	}
	
	//�Զ���������д
	@Override
	public void eat() {
		System.out.println(this.getName()+"�Թ�ͷ");
	}
 

}











