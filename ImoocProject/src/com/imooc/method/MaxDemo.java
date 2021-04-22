package com.imooc.method;

public class MaxDemo {
	
	public void max(float a , float b) {
		float max;
		if (a>b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println(a +" 和 "+b+"的最大值为:"+max);
	}

	public static void main(String[] args) {
		MaxDemo maxDemo=new MaxDemo();
		int a=5,b=3;
		maxDemo.max(a, b);
		maxDemo.max(9.8f,12.8f);
	}

}

