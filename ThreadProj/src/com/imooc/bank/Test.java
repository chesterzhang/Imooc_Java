package com.imooc.bank;

//�߳�ͬ������
public class Test {

	public static void main(String[] args) {
		//�����˻�, �������Ϊ1000
		Bank bank=new Bank("123456789", 1000);
		
		//�����̶߳���
		SaveAccount sa= new SaveAccount(bank);
		WithdrawAccount wa= new WithdrawAccount(bank);
		
		Thread save=new Thread(sa);
		Thread withdraw= new Thread(wa);
		
		save.start();
		withdraw.start();
		
		 
		try {
			save.join();
			withdraw.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bank);
		

	}

}
