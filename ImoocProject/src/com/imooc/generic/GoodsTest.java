package com.imooc.generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {

	public static void main(String[] args) {
		// ����book��ص�List
		List<Book> books=new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book());
		
		//����clothes��ص�List
		List <Clothes> clothes= new ArrayList<Clothes>();
		clothes.add(new Clothes());
		clothes.add(new Clothes());
		
		//����GoodsSeller ������ɶ���Ʒ�б�books,clothes������
		GoodsSeller gs1= new GoodsSeller();
		GoodsSeller gs2= new GoodsSeller();
		gs1.sellGoods(books);
		gs2.sellGoods(clothes);

	}

}
