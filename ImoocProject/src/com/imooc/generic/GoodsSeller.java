package com.imooc.generic;

import java.util.List;

public class GoodsSeller {
	public void sellGoods(List<? extends Goods> goods) {
		//���ü����е�sell����
		for(Goods g:goods) {
			g.sell();
		}
		
	}
	
}
