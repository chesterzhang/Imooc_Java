package com.imooc.tel;

//要想一个类不实现接口里面的方法,必须设置为抽象类
public abstract  class Computer implements INet {

	@Override
	public void newtork() {
		System.out.println("电脑可以上网");
		
	}

}
