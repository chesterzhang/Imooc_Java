package com.imooc.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//����������, ʹ�û���������һ�δζ�д����,����һ���Զ�д��������߶�д�ٶ�
public class BufferedDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Imooc_Java\\ImoocProject\\file\\imooc.txt");
			BufferedOutputStream bos =new BufferedOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\imooc.txt");
			BufferedInputStream bis =new BufferedInputStream(fis);
			
			bos.write(50);
			bos.write('a');
			bos.flush();//��ջ�����,д�뵽�ļ� 
			
			System.out.println(bis.read());
			System.out.println((char)bis.read());
			
			fos.close();
			bos.close();
			fis.close();
			bis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}












