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

			// �ȶ���д���� 
			int n = 0;
			char[] cbuf = new char[10];// InputStreamReader.read(cbuf)����ֱ�Ӷ����ַ����뵽cbuf��, һ���Զ�10��
			
			while ((n = isr.read(cbuf)) != -1) {
				String s = new String(cbuf, 0, n);
				osw.write(s);
				osw.flush();//�������һ��
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
