package com.imooc.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//将对象写入文件中, 通过ObjectOutputStream
public class ObjectOutputSrteamDemo1 {

	public static void main(String[] args) {
		Goods goods1 = new Goods("s0001", " computer", 4000);
		
		try {
			FileOutputStream fos =new FileOutputStream("D:\\Imooc_Java\\ImoocProject\\file\\goods.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);  
			
			oos.writeObject(goods1);
			oos.flush();
			fos.close();
			oos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
