package com.imooc.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		Map<String,Goods> goodsMap=new HashMap<String,Goods>();
		System.out.println("请输入两个商品信息 ");
		
		for(int i=0;i<2;i++) {
			System.out.println("请输入第"+(i+1)+"条商品信息 : ");
			System.out.println("请输入商品编号 : ");
			String goodsId=console.next();
			//判断商品ID是否已经存在
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("该商品编号已经存在,请重新输入！ ");
				i--;
				continue;
			}
			System.out.println("请输入商品名称 : ");
			String goodsName=console.next();
			System.out.println("请输入商品价格 : ");
			double goodsPrice;
			try {
				 goodsPrice=console.nextDouble();
			}catch(java.util.InputMismatchException e) {
				System.out.println(" 商品价格必须为数字，请重新输入！ ");
				i--;
				console.next();//相当于把输入流清空,不干预下一次读取
				continue;
			}
			
			Goods goods=new Goods(goodsId, goodsName, goodsPrice);
			//将商品信息添加到HashMap中
			goodsMap.put(goodsId, goods);
		}
		
		System.out.println("=========================");
		//遍历Map,输出商品信息
		System.out.println("商品全部信息为 : ");
		Iterator<Goods> itGoods= goodsMap.values().iterator();
		while(itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
				
	}
}
