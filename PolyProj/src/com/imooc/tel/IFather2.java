package com.imooc.tel;

public interface IFather2 {
	
	void fly();
	default void connection() {
		System.out.println("IFather2ÖÐµÄconnection");
	}

}
