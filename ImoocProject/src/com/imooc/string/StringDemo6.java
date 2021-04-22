package com.imooc.string;

//String 的不可变性
//String对象一旦被创建,则不能修改,是不可变的
//所谓的修改其实是创建了新的对象,所指向的内存空间不变
public class StringDemo6 {

	public static void main(String[] args) {
		String s1="imooc";//s1指向常量池里面的"imooc"
		s1="hello,"+s1;//s1指向常量池里面的"hello,imooc"
		System.out.println("s1="+s1);
		
		
	}
}



