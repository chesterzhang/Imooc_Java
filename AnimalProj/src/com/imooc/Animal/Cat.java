package com.imooc.Animal;

public class Cat extends Animal {
	private double weight;
	 
	
	static {
		System.out.println("�������ྲ̬�����");
	}
	
	{
		System.out.println("�������๹������");
	}
	
	public Cat() {
		System.out.println("�������๹�췽��");
	}
	
	public Cat(String name, int month ) {
		//���๹��Ĭ�ϵ��ø�����޲ι��췽��
		//����ͨ��super()���ø����������ʵĴ��ι���
		//super()������ڵ�һ��
		super(name,month);
		System.out.println("����������ι��췽��");
	}
	

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//�ܶ�
	public void run() {
		System.out.println(this.getName()+"��һֻ"+this.getSpecies()+"�ڿ��ֵı��� !");
	}
	
}
