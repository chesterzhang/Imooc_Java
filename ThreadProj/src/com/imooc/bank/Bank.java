package com.imooc.bank;

//ģ�������˻����, ȡ�����, ��������ͬ������
public class Bank {

	private String account;// �˺�
	private int balance;// �˻����

	public Bank(String account, int balance) {
		this.account = account;
		this.balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// ģ�������,һ�δ��100Ԫ, ʹ���߳�ͬ��
	public synchronized void saveMoney() {
		// ��ȡ��ǰ�˻����
		int balance = this.getBalance();

		// �����ý�������1��,�������յ�����һ���߳�
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �޸����,��100Ԫ
		balance = balance + 100;

		// �޸��˻����
		this.setBalance(balance);

		// ������ڵ����
		System.out.println("���100���˻����Ϊ : " + this.getBalance());

	}

	// ģ��ȡ�����, һ��ȡ200, ʹ���߳�ͬ��
	public void withdrawMoney() {
		synchronized (this) {
			// ��ȡ��ǰ�˻����
			int balance = this.getBalance();

			balance = balance - 200;

			// �����ý�������1��,�������յ�����һ���߳�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// �޸��˻����
			this.setBalance(balance);
			// ������ڵ����
			System.out.println("ȡ��200���˻����Ϊ : " + this.getBalance());
		}

	}

	@Override
	public String toString() {
		return "Bank [�˻� : " + account + ", ��� : " + balance + "]";
	}

}
