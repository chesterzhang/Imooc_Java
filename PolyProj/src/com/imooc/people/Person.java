package com.imooc.people;
//�ⲿ��
public class Person {
	public int age;
	
	public Heart getHeart() {
		return new Heart();
	}
	
	public void eat() {
		System.out.println("�˻�Զ���");
	}
	
	//�ڲ���
/*
	class Heart {
		public String beat() {
			eat();
			return age+"�������������";
		}
	}
*/
	
	//��̬�ڲ���
	/*
	 * 1.��̬�ڲ�����,ֻ��ֱ�ӷ����ⲿ��ľ�̬��Ա��, ����Ҫ���÷Ǿ�̬��Ա��Ҫͨ���ⲿ����ʵ��
	 * 2.��̬�ڲ������ʵ��ʱ,���Բ��������ⲿ�����
	 * 3.����ͨ���ⲿ��.�ڲ���.��̬��Ա�ķ�ʵ,�����ڲ����еľ�̬��Ա
	 * 4.���ڲ����������ⲿ������ͬ��ʱ,Ĭ��ֱ�ӵ����ڲ����еĳ�Ա;��Ҫ�����ⲿ���еľ�̬���ԣ���
	 * ͨ���ⲿ��.���Եķ�ʵ
	 * ��Ҫ�����ⲿ���еķǾ�̬����, �ڿ���ͨ�� new�ⲿ��().���Եķ�ʽ
	 */
	
	public static class Heart {
		public String beat() {
			// eat(); ֻ�о�̬
			return new Person().age+"�������������";
		}
	}
	
	
	

}
