package com.imooc.tel;

public interface INet {
	//�ӿڳ��󷽷����Բ�дabstract������Ĭ��public
	//�ӿڷ��������б���ȫ��ʵ��, ���ǽ�������Ϊ������
	public void newtork();
	
	//Ĭ�Ϸ���: ���Դ���, ��ʵ�ֽӿڵ����п��Բ���д
	default public void connection() {
		System.out.println("����Ĭ�����ӷ���");
	}
	
	//�ӿ��п��Զ��峣��,Ĭ��public static final
	int temp=20;
	
	//static ��̬����,���Դ���, ��ʵ�ֽӿڵ����в�������д,ͨ���ӿ�������
	static void stop() {
		System.out.println("���ǽӿھ�̬����");
	}
}
