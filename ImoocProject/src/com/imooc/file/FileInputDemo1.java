package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//FileInputStream
public class FileInputDemo1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis =new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\score.txt");
			int n=fis.read();
			while (n!=-1) {
				System.out.print((char)n);
				n=fis.read();
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
