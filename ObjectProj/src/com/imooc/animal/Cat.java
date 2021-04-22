package com.imooc.animal;
/**
 * ����è��
 * @author Chester_Zhang
 *
 */

public class Cat {
	//��Ա����:�ǳ�, ����, ����, Ʒ��
	private String name; //Ĭ��null
	private int month;//Ĭ��0
	private double weight;//Ĭ��0.0
	private String species;//Ĭ��null
	
	//static: ��̬��Ա, Ҳ�����Ա, ������ʵ�������ٸ�����, ������ͬһ�龲̬�ռ�
	public static int price;//�۸�
	
	//��̬��������ڹ�������ִ��,�����۶��ٸ�����,ֻ��ִ��һ��
	static {
		price=200;
	}
	
	//�޲ι��캯��
	public Cat() {
		//System.out.println("�����޲ι��캯����");
		System.out.println("���ǳ���è��");
	}
	
	//���캯������
	public Cat(String name, int month, double weight, String species) {
		this.setName(name);
		this.setMonth(month);
		this.setWeight(weight);
		this.setSpecies(species);
	 
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return "����"+this.name+"!";
	}

	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month<=0) {
			System.out.println("������Ϣ����, èè����������0��");
		}else {
			this.month = month;
		}
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	//����:�ܶ�
	public void run() {
		System.out.println("Сè���� ��");
	}
	
	//�����ܶ�����
	public void run(String name) {
		System.out.println(name+"���� ��");
	}

	//����: �Զ���
	//static ���� , �෽��, ��̬����
	public static void eat() {
			System.out.println("Сè���� ��");
		}
		
}
