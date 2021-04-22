package com.imooc.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\good_morning.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br =new BufferedReader(isr);
			FileOutputStream fos = new FileOutputStream("D:\\Imooc_Java\\ImoocProject\\file\\good_morning_copy2.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw= new BufferedWriter(osw );

			// 先读再写操作 
			int n = 0;
			char[] cbuf = new char[10];// InputStreamReader.read(cbuf)方法直接读出字符存入到cbuf中, 一次性读10个
			
			while ((n = isr.read(cbuf)) != -1) {
				String s = new String(cbuf, 0, n);
				bw.write(s);
				bw.flush();//必须加这一句
			}

			fis.close();
			isr.close();
			br.close();
			fos.close();
			osw.close();
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
}


