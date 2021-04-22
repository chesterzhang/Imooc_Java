package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {

	public static void main(String[] args) {
		Goods g1 = new Goods("s0001", "phone", 2000);
		Goods g2 = new Goods("s0002", "tv", 3000);

		List<Goods> goodsList = new ArrayList<Goods>();

		goodsList.add(g1);
		goodsList.add(g2);

		// ����Ʒ�۸���н�������ǰ
		System.out.println("����Ʒ�۸���н�������ǰ : ");
		for (Goods goods : goodsList) {
			System.out.println(goods);
		}

		// ����Ʒ�۸���н�������
		Collections.sort(goodsList);

		// ����Ʒ�۸���н��������
		System.out.println("����Ʒ�۸���н�������� : ");
		for (Goods goods : goodsList) {
			System.out.println(goods);
		}

	}

}
