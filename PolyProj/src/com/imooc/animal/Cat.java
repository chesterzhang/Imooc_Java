package com.imooc.animal;

public class Cat extends Animal {
	//��������: ����
	private double weight;
	
	public Cat() {
		
	}
	
	public Cat(String name, int month, double weight) {
		super(name,month);
		this.setWeight(weight);
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	//��������:�ܶ�
	public void run() {
		System.out.println("èè����!");
	}
	
	//��д�Զ���
	@Override
	public void eat() {
		System.out.println("èè�����!");
	}

	public void playball() {
		System.out.println("èè������!");
		
	}
	
	
}
