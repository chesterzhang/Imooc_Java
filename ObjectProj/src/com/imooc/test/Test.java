package com.imooc.test;//�����
//import com.imooc.animal.*; //����һ���������������
import com.imooc.animal.Cat;//����һ���������һ����
//import com.imooc.mechanics.*;//����һ���������������


public class Test {

	public static void main(String[] args) {
		//import�����������Ҫָ��package
		//com.imooc.animal.Cat  cat=new com.imooc.animal.Cat();
	
		//ֱ�Ӽ���com.imooc.animal.CatTest��
		//com.imooc.animal.CatTest  tex=new com.imooc.animal.CatTest();

		Cat one=new Cat();
		one.setName("����");
		one.setMonth(2);
		one.setSpecies("Ӣ��");
		one.price=2000;
		Cat.price=3000;//�Ƽ�ʹ����������
		
		//Cat two=new Cat();
		//two.setName("����");
		//two.setMonth(1);
		//two.setSpecies("�л���԰è");
		//two.price=150;
		
		System.out.println(one.getName()+" �ҵ��ۼ�"+one.price);
		//System.out.println(two.getName()+" �ҵ��ۼ�"+two.price);
		
		
	}

}
