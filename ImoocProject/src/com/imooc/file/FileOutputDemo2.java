package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//文件拷贝操作, 见java.base.io文档
public class FileOutputDemo2 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\Imooc_Java\\ImoocProject\\image\\panda.jpg");
			FileOutputStream fos= new FileOutputStream("D:\\Imooc_Java\\ImoocProject\\image\\panda_copy.jpg");
			int n=0;
			byte[] b= new byte[2];
			while((n=fis.read(b))!=-1) {
				fos.write(b,0,n);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
