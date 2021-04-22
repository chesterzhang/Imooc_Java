package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
 
//将对象从入文件中读出来, 通过ObjectIntputStream
public class ObjectInputStreamDemo1 {

	public static void main(String[] args) {

		try {
			FileInputStream fis =new FileInputStream("D:\\Imooc_Java\\ImoocProject\\file\\goods.txt");
			ObjectInputStream   ois = new  ObjectInputStream (fis);
			
			Goods goods =(Goods)ois.readObject();
			System.out.println(goods);
			
			fis.close();
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
