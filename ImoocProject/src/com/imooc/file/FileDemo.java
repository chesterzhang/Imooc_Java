package com.imooc.file;

import java.io.File;
import java.io.IOException;


//File�ೣ�÷���, ����ĵ� java.base.File ��
public class FileDemo {

	public static void main(String[] args) {
		//����File����
		File file1= new File("D:\\Imooc_Java\\ImoocProject\\file\\score.txt");
		//File file1= new File("D:\\Imooc_Java\\ImoocProject������\\file\\score.txt");
		
		//�ж����ļ�����Ŀ¼
		System.out.println("�Ƿ���Ŀ¼ ? "+file1.isDirectory());
		System.out.println("�Ƿ����ļ� ? "+file1.isFile());
		
		//����Ŀ¼
		File file2=new File("D:\\Imooc_Java\\ImoocProject\\filefolder");
		if (!file2.exists()) {
			file2.mkdirs();//�����༶Ŀ¼Ҫ��mkdirs
		}
		
		//�����ļ�
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//����·��
		System.out.println("�Ƿ����·�� ? "+file1.isAbsolute());
		
	}

}




