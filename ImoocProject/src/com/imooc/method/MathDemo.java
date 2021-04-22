package com.imooc.method;

//方法重载, 方法类型,返回型，名称相同,参数列表不相同
public class MathDemo {
	
	//求两个int类型的和
	public int plus(int m, int n) {
		return m+n;
	}
	
	//求两个double类型的和
	public double plus(double m, double n) {
		return m+n;
	}
	
	//求数组元素的和
	public int plus(int[] arr) {
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}


	public static void main(String[] args) {
		int m=5, n=10;
		int[] arr= {1,2,3,4,5,6};
		MathDemo mathDemo=new MathDemo();
		System.out.println("int 类型的和:"+mathDemo.plus(m,n));
		System.out.println("float 类型的和:"+mathDemo.plus(5.5,6.5));
		System.out.println("数组元素的和:"+mathDemo.plus(arr));

	}

}
