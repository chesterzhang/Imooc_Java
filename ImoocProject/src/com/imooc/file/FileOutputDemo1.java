package com.imooc.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//ÎÄ¼þÐ´²Ù×÷
public class FileOutputDemo1 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("D:\\Imooc_Java\\ImoocProject\\file\\imooc.txt");
			fos.write(50);
			fos.write('a');
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
