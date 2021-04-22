package com.imooc.datamanager;
/**
 * �Ӽ��̽����������ݴ�ŵ�������,���������е����ݽ��й���
 * @author Chester_Zhang
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException ;

public class DataManage {
	
	//һ���Բ���9��int����
	public int[] insertData() {
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		//�ٽ���һ��һ������,Ϊ��ָ��λ�ò���������׼��
		for(int i=0;i<a.length-1;++i) {
			System.out.println("�������"+(i+1)+"������:");
			try {
				a[i]=sc.nextInt();//��һ������ȡ����int����,������������Դ�����sc��,�����ᱻ�ͷų���
			}catch(java.util.InputMismatchException e) {
				System.out.println("�������ݸ�ʽ����,�����з�����" );
				sc.next();//�൱�ڰ�sc��ȡ������������ͷ���,׼����ȡ��һ��������
				i--;
			}
		}
		
		return a;
	}
	
	/**
	 * ��ʾ������Ԫ�ص�����
	 * @param a:����
	 * @param lenghth:��ʾ����ĸ���
	 */
	public void showData(int[] a, int length) {
		for(int i=0; i<length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * �Ӽ��̽���һ������,���뵽�����ָ��λ�ô�
	 * @param a Ҫ�������ݵ�����
	 * @param n Ҫ���������
	 * @param k Ҫ�����λ��,��0��ʼ
	 */
	public void insertAtArray(int[] a,int n,int k) {
		//�����һ�����ݿ�ʼ�ƶ�
		for(int i=a.length-1;i>k;i--) {
			a[i]=a[i-1];
		}
		a[k]=n;
	}
	
	/**
	 * ����������ܱ�3������Ԫ��
	 * @param a ����
	 */
	public void divThree(int[] a) {
		String str="";
		int count =0; //ͳ���ж��ٸ�Ԫ���ܱ�3����
		for (int n:a) {
			if(n%3==0) {
				str=str+n+" ";
				count++;
			}
		}
		if (count==0) {
			System.out.println("������û���ܱ�3������Ԫ�أ�");
		}else {
			System.out.println("���������ܱ�3������Ԫ�� : "+str);
		}
		
	}
	
	/**
	 * ��ʾ��Ϣ
	 */
	public void notice() {
		System.out.println("***********************************************");
		System.out.println("		1--��������");
		System.out.println("		2--��ʾ��������");
		System.out.println("		3--��ָ��λ�ò�������");
		System.out.println("		4--��ѯ�ܱ�3����������");
		System.out.println("		0--�˳�");
		System.out.println("***********************************************");
	}

	public static void main(String[] args) {
		DataManage dm=new DataManage();
		Scanner sc=new Scanner(System.in);
		int input;
		int[] a=null;
		int n=0,k=0; //n��ʾ��������,k��ʾ����λ��
		
		while(true) {
			dm.notice();
			System.out.println("�������Ӧ�����ֽ��в��� : ");
			try {
				input =sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("��������ݸ�ʽ���󣡲����з�����");
				sc.next();
				continue;
			}
			
			if (input==0) {
				System.out.println("�˳����� ! ");
				break;
			}
			
			switch(input) {
			case 1: 
				//��������
				a=dm.insertData();
				//��ʾ����
				System.out.println("����Ԫ��Ϊ : ");
				dm.showData(a, a.length-1);
				break;
				
			case 2:
				if (a!=null) {
					System.out.println("����Ԫ��Ϊ : ");
					if (a[a.length-1]==0) {
						//�����������һ��Ԫ��Ϊ0, ˵����û�в�������, ��˲���ʾ���һ��Ԫ��
						dm.showData(a, a.length-1);
					}else {
						dm.showData(a, a.length);
					}
				}else {
					System.out.println("��δ�������в�������,������ѡ����� ! ");
				}
				break;
				
			case 3:
				//��ָ��λ�ò�������
				if (a!=null) {
					System.out.println("������Ҫ��������� : ");
					try {
						n=sc.nextInt();
						System.out.println("������Ҫ�������ݵ�λ�� : ");
						k=sc.nextInt();
					}catch(InputMismatchException e ) {
						System.out.println("��������ݸ�ʽ���󣡲����з�����");
						sc.next();
						break;
					}
					
					dm.insertAtArray(a, n, k);
					dm.showData(a, a.length);
				}else {
					System.out.println("��δ�������в�������,������ѡ����� ! ");
				}
				break;
				
			case 4:
				//��ѯ�������ܱ�3������Ԫ��
				if (a!=null) {
					dm.divThree(a);
				} else {
					System.out.println("��δ�������в�������,������ѡ����� ! ");
				}
				break;
			}
		}
		/*
		 
		int[] a=dm.insertData();
		dm.showData(a, a.length-1);
		dm.showData(a, a.length);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������Ҫ��������� : ");
		int n=sc.nextInt();
		System.out.print("������Ҫ�����λ�� : ");
		int k=sc.nextInt();
		dm.insertAtArray(a,n,k);
		dm.showData(a, a.length);
		dm.divThree(a);
		
		 */
		
		
	}

}
