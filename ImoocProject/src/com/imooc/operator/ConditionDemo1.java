package com.imooc.operator;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// ��������Ʒ�۸����100���20,���ԭ�ۺ��ۺ�۸�
		double price1,price2;
		price1=80;
		price2=55;
		
		double sum=price1+price2;
		if (sum>=100) {
			sum=sum-20;
			
		}
		System.out.println("�ۺ�۸�:"+sum);

	}

}
