package com.imooc.animal;
 

public class Master {
	/*
	 * ι����
	 * ιèè : èè���궫��ȥ������
	 * ι���� : ��������ȥ˯����
	 */
	
	//����1, ָ����������
	public void feed(Cat cat) {
		cat.eat();
		cat.playball();	
	}
	
	public void feed(Dog dog) {
		dog.eat();
		dog.sleep();
	}
	
	//����2: ���븸��, ��������ת��,ת��������
	public void feed(Animal obj) {
		if (obj instanceof Cat ) {
			Cat temp= (Cat)obj;
			temp.eat();
			temp.playball();	
		}else if (obj instanceof Dog ) {
			Dog temp= (Dog)obj;
			temp.eat();
			temp.sleep();
		}
		
	}
	
	/*
	 * �������ֳ���
	 * ����ʱ���: ������
	 * ����ʱ����:��èè
	 */
	// ����1
	public Dog hasMuchTime() {
		System.out.println("�����кܶ�ʱ��, �ʺ�������.");
		return new Dog();
	}
	
	public Cat hasLittleTime() {
		System.out.println("����û�кܶ�ʱ��, �ʺ�������.");
		return new Cat();
	}
	
	// ����2
	public Animal raisePet(boolean hasMuchTime) {
		if (hasMuchTime) {
			System.out.println("�����кܶ�ʱ��, �ʺ�������.");
			return new Dog();
		}else {
			System.out.println("����û�кܶ�ʱ��, �ʺ�������.");
			return new Cat();
		}
	}

}
