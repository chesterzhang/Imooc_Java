package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		Map<String,Goods> goodsMap=new HashMap<String,Goods>();
		System.out.println("������������Ʒ��Ϣ ");
		
		for(int i=0;i<2;i++) {
			System.out.println("�������"+(i+1)+"����Ʒ��Ϣ : ");
			System.out.println("��������Ʒ��� : ");
			String goodsId=console.next();
			//�ж���ƷID�Ƿ��Ѿ�����
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("����Ʒ����Ѿ�����,���������룡 ");
				i--;
				continue;
			}
			System.out.println("��������Ʒ���� : ");
			String goodsName=console.next();
			System.out.println("��������Ʒ�۸� : ");
			double goodsPrice;
			try {
				 goodsPrice=console.nextDouble();
			}catch(java.util.InputMismatchException e) {
				System.out.println(" ��Ʒ�۸����Ϊ���֣����������룡 ");
				i--;
				console.next();//�൱�ڰ����������,����Ԥ��һ�ζ�ȡ
				continue;
			}
			
			Goods goods=new Goods(goodsId, goodsName, goodsPrice);
			//����Ʒ��Ϣ��ӵ�HashMap��
			goodsMap.put(goodsId, goods);
		}
		
		System.out.println("=========================");
		//����Map,�����Ʒ��Ϣ
		System.out.println("��Ʒȫ����ϢΪ : ");
		Iterator<Goods> itGoods= goodsMap.values().iterator();
		while(itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
				
	}
}
