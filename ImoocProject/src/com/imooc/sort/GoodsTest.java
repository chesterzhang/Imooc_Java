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

		// 对商品价格进行降序排序前
		System.out.println("对商品价格进行降序排序前 : ");
		for (Goods goods : goodsList) {
			System.out.println(goods);
		}

		// 对商品价格进行降序排序
		Collections.sort(goodsList);

		// 对商品价格进行降序排序后
		System.out.println("对商品价格进行降序排序后 : ");
		for (Goods goods : goodsList) {
			System.out.println(goods);
		}

	}

}
