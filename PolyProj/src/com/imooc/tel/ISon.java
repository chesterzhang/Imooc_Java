package com.imooc.tel;

//�ӿڿ���ʵ�ֶ���̳�
public interface ISon extends IFather, IFather2 {
	void run() ;

	@Override
	default void connection() {
			System.out.println("ISon�е�connection");
	}
	
}
