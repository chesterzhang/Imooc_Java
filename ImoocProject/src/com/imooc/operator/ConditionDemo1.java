package com.imooc.operator;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// 若两件商品价格大于100则减20,输出原价和折后价格
		double price1,price2;
		price1=80;
		price2=55;
		
		double sum=price1+price2;
		if (sum>=100) {
			sum=sum-20;
			
		}
		System.out.println("折后价格:"+sum);

	}

}
