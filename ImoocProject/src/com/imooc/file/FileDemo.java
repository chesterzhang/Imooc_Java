package com.imooc.file;

import java.io.File;
import java.io.IOException;


//File类常用方法, 详见文档 java.base.File 类
public class FileDemo {

	public static void main(String[] args) {
		//创建File对象
		File file1= new File("D:\\Imooc_Java\\ImoocProject\\file\\score.txt");
		//File file1= new File("D:\\Imooc_Java\\ImoocProject“，”\\file\\score.txt");
		
		//判读是文件还是目录
		System.out.println("是否是目录 ? "+file1.isDirectory());
		System.out.println("是否是文件 ? "+file1.isFile());
		
		//创建目录
		File file2=new File("D:\\Imooc_Java\\ImoocProject\\filefolder");
		if (!file2.exists()) {
			file2.mkdirs();//创建多级目录要用mkdirs
		}
		
		//创建文件
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//绝对路径
		System.out.println("是否绝对路径 ? "+file1.isAbsolute());
		
	}

}




