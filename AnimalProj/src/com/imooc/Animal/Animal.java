package com.imooc.Animal;

/*
 * final public class : ����û������, �������̳�
 * final ���� : �÷�����������д, ���Ա�����̳�, ����
 * final �ֲ�����, ��ֵ�������޸�
 * final ���Ա:1. ����ֱ�ӳ�ʼ�� 2.���췽�� 3.��������
 */
public class Animal {
	/*private:ֻ�������н��з���
	 * public:��������λ�÷���
	 * protected:��ǰ��,ͬ������,������඼���Է��� 
	 * 
	 */
	private String name;
	protected int month;
	private String species;
	
	 
	
	static {
		System.out.println("���Ǹ��ྲ̬�����");
	}
	
	{
		System.out.println("���Ǹ��๹������");
	}
	
	
	public Animal() {
		System.out.println("���Ǹ����޲ι��췽��");
	}
	
	public Animal(String name, int month ) {
		this.name=name;
		this.month=month;
		System.out.println("���Ǹ�����ι��췽��");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	//�Զ���
	public void eat() {
		System.out.println(this.getName()+"�ڳԶ���");
	}
	
	public void eat(String name) {
		System.out.println(name+"�ڳԶ���");
	}
	
	//��дObject ��equals����
	public boolean equals(Object obj) {
		if (obj==null) {
			return false;
		}
		Animal temp=(Animal) obj;//Ҫ��֤obj ����ת��ΪAnimal ����
		if(this.getName()==(temp.getName()) && this.getMonth() ==temp.getMonth() ) {
			return true;
		}else {
			return false;
		}

	}
	
	//����equals����
		public boolean equals(Animal obj) {
			if (obj==null) {
				return false;
			}
		 
			if(this.getName()==(obj.getName()) && this.getMonth() ==obj.getMonth() ) {
				return true;
			}else {
				return false;
			}

		}
		
		//��дtoString
		public String toString() {
			return "�ǳ� : "+this.getName()+" , ���� : "+this.getMonth();
		}
	
}
