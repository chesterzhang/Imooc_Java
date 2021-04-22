package com.imooc.animal;

// ����һ����Ϊ������, �޷���ֱ��ʵ����,����ͨ��ʵ�������࣬Ȼ������ת��
public abstract   class Animal {
	private String name;
	private int month;
	
	public Animal() {
		
	}
	
	public Animal(String name, int month) {
		this.setName(name);
		this.setMonth(month);
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	//�Զ���, ���󷽷����붨���ڳ��������棬�������з����壬���������д
	public abstract void eat();

	
}
