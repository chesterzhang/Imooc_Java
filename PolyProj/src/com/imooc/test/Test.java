package com.imooc.test;
//չʾ��̬
import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {
		//Animal one=new Animal(); �������޷�ֱ��ʵ����,ֻ��ͨ����������ת��
		
		//����ת��,�Զ�ת��,��������ת��
		//���������еķ����޷�����,���Ե�ƽӹ������д����ķ����Լ����෽��
		
		Animal two=new Cat();
		Animal three=new Dog();
		System.out.println(two);//�����Ȼ�� Cat��
		System.out.println(three);//�����Ȼ��Dog��
		 
		two.eat();
		three.eat();
		
		System.out.println("\n===========================================\n");
		//����ת��, ǿ������ת��
		//����ת������, ����ʹ��ǿת��
		// a instanceof b : �ж�a�Ƿ���b��ʵ��
		if (two instanceof Cat) {
			Cat temp=(Cat) two;
			temp.eat();
			temp.run();
		}
		
		if (two instanceof Dog) {
			Dog temp2=(Dog) two; //һ�����಻��ת������һ������
			temp2.eat();
			temp2.sleep();
		}
		
		System.out.println("\n===========================================\n");
		
		if (two instanceof Animal) {
			System.out.println("two �� Animal��ʵ��");
		}
		
		
		
		

	}

}
