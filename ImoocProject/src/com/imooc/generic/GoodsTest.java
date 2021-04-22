package com.imooc.generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {

	public static void main(String[] args) {
		// 定义book相关的List
		List<Book> books=new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book());
		
		//定义clothes相关的List
		List <Clothes> clothes= new ArrayList<Clothes>();
		clothes.add(new Clothes());
		clothes.add(new Clothes());
		
		//调用GoodsSeller 对象完成对商品列表books,clothes的销售
		GoodsSeller gs1= new GoodsSeller();
		GoodsSeller gs2= new GoodsSeller();
		gs1.sellGoods(books);
		gs2.sellGoods(clothes);

	}

}
