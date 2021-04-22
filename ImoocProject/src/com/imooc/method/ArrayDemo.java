package com.imooc.method;

public class ArrayDemo {
	//对象是引用数据类型,方法传参时直接引用
	//定义一个用于修改某个个数组元素的方法
	public void updateArray(int[] a) {
		a[3]=15;
		System.out.println("数组a的元素为 : ");
		for (int n :a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5};
		System.out.println("方法调用前数组a的元素为 : ");
		for( int n :a1) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		ArrayDemo ad=new ArrayDemo();
		ad.updateArray(a1);
		
		System.out.println("方法调用后数组a的元素为 : ");
		for( int n :a1) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		
	}

}
