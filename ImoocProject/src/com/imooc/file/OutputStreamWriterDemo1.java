package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\good_morning.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			FileOutputStream fos = new FileOutputStream("D:\\Imooc_Java\\ImoocProject\\file\\good_morning_copy.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);

			// 先读再写操作 
			int n = 0;
			char[] cbuf = new char[10];// InputStreamReader.read(cbuf)方法直接读出字符存入到cbuf中, 一次性读10个
			
			while ((n = isr.read(cbuf)) != -1) {
				String s = new String(cbuf, 0, n);
				osw.write(s);
				osw.flush();//必须加这一句
			}

			fis.close();
			isr.close();
			fos.close();
			osw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
