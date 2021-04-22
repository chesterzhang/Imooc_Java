package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//字节字符转换流, 相当于将字节转换为字符的一个桥梁
//用FileInputStream对象初始化InputStreamReader,InputStreamReader.read()方法直接读出字符
public class InputStreamReaderDemo1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\good_morning.txt");
			InputStreamReader isr = new InputStreamReader(fis);
		 

			// 读操作
			int n = 0;
			char[] cbuf = new char[10];// InputStreamReader.read(cbuf)方法直接读出字符存入到cbuf中, 一次性读10个

			while ((n = isr.read(cbuf)) != -1) {
				String s = new String(cbuf, 0, n);
				System.out.print(s);
			}

			fis.close();
			isr.close();
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
