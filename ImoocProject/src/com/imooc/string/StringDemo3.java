package com.imooc.string;

import java.io.UnsupportedEncodingException;

//�ַ�����byte����֮����໥ת�� 
public class StringDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str="Java ��� ����";
		//���ַ���ת��Ϊbyte����,����ӡ���
		byte[] arrs=str.getBytes("GBK"); //Ҳ���Բ�ָ�������ʽ,winĬ��GBK��macĬ��UTF-8
		for(int i=0;i<arrs.length;i++) {
			System.out.println(arrs[i]);
		}
		
		//��byte����ת��Ϊ�ַ���
		String str1=new String(arrs,"GBK");//Ҳ���Բ�ָ�������ʽ,winĬ��GBK
		System.out.println(str1);
		
	}

}



