package com.imooc.method;

//��������, ��������,�����ͣ�������ͬ,�����б���ͬ
public class MathDemo {
	
	//������int���͵ĺ�
	public int plus(int m, int n) {
		return m+n;
	}
	
	//������double���͵ĺ�
	public double plus(double m, double n) {
		return m+n;
	}
	
	//������Ԫ�صĺ�
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
		System.out.println("int ���͵ĺ�:"+mathDemo.plus(m,n));
		System.out.println("float ���͵ĺ�:"+mathDemo.plus(5.5,6.5));
		System.out.println("����Ԫ�صĺ�:"+mathDemo.plus(arr));

	}

}
