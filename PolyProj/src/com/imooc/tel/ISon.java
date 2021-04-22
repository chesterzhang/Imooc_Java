package com.imooc.tel;

//接口可以实现多个继承
public interface ISon extends IFather, IFather2 {
	void run() ;

	@Override
	default void connection() {
			System.out.println("ISon中的connection");
	}
	
}
