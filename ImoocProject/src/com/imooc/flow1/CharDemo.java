package com.imooc.flow1;

public class CharDemo {

	public static void main(String[] args) {
		// ѭ�����26��Ӣ��Сд��ĸ, ���������
		char ch='a';
		int count=1;//���ƻ���
		while (ch<='z'){
			System.out.print(ch+"");
			if (count%13==0) {
				System.out.println();
			}
			count ++;
			ch++;
		}
	}

}


