package com.imooc.tel;

public class FourthPhone extends ThirdPhone implements Iphoto, INet {
	//public void photo() {
	//	System.out.println("手机可以看视频");
	//}
	public void network() {
		System.out.println("手机可以上网");
	}
	public void game() {
		System.out.println("手机可以玩游戏");
	}
	@Override
	public void photo() {
		System.out.println("手机可以拍照");
		
	}
	@Override
	public void newtork() {
		System.out.println("手机可以上网");
		
	}
	
	//重写父类
	public void connection() {
		System.out.println("四代手机中的connection");
		
	}

}


