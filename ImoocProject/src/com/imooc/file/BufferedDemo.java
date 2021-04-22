package com.imooc.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//缓冲流案列, 使用缓冲流避免一次次读写操作,尽量一次性读写操作，提高读写速度
public class BufferedDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Imooc_Java\\ImoocProject\\file\\imooc.txt");
			BufferedOutputStream bos =new BufferedOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\imooc.txt");
			BufferedInputStream bis =new BufferedInputStream(fis);
			
			bos.write(50);
			bos.write('a');
			bos.flush();//清空缓冲流,写入到文件 
			
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












