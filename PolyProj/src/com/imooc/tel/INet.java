package com.imooc.tel;

public interface INet {
	//接口抽象方法可以不写abstract，访问默认public
	//接口方法在类中必须全部实现, 除非将类设置为抽象类
	public void newtork();
	
	//默认方法: 可以带体, 在实现接口的类中可以不重写
	default public void connection() {
		System.out.println("我是默认连接方法");
	}
	
	//接口中可以定义常量,默认public static final
	int temp=20;
	
	//static 静态方法,可以带体, 在实现接口的类中不可以重写,通过接口名调用
	static void stop() {
		System.out.println("我是接口静态方法");
	}
}
