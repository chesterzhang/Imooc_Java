package com.imooc.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo1 {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\good_morning.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br =new BufferedReader(isr);
			
		 

			// 读操作
			int n = 0;
			char[] cbuf = new char[10];// InputStreamReader.read(cbuf)方法直接读出字符存入到cbuf中, 一次性读10个

			while ((n = br.read(cbuf)) != -1) {
				String s = new String(cbuf, 0, n);
				System.out.print(s);
			}

			fis.close();
			isr.close();
			br.close();
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
