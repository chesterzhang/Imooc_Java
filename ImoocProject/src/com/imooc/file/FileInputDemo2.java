package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis =new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\score.txt");
			byte[] b=new byte[10];
			fis.read(b,0,5);
			System.out.print(new String(b));
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
