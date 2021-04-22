package com.imooc.tel;

public interface IFather {
	
	void say();
	default void connection() {
		System.out.println("IFatherÖÐµÄconnection");
	}

}
