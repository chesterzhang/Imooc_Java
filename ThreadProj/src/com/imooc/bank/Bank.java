package com.imooc.bank;

//模拟银行账户存款, 取款操作, 描述进程同步问题
public class Bank {

	private String account;// 账号
	private int balance;// 账户余额

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

	// 模拟存款操作,一次存款100元, 使用线程同步
	public synchronized void saveMoney() {
		// 获取当前账户余额
		int balance = this.getBalance();

		// 故意让进程阻塞1秒,用来引诱调用另一个线程
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 修改余额,加100元
		balance = balance + 100;

		// 修改账户余额
		this.setBalance(balance);

		// 输出现在的余额
		System.out.println("存款100后账户余额为 : " + this.getBalance());

	}

	// 模拟取款操做, 一次取200, 使用线程同步
	public void withdrawMoney() {
		synchronized (this) {
			// 获取当前账户余额
			int balance = this.getBalance();

			balance = balance - 200;

			// 故意让进程阻塞1秒,用来引诱调用另一个线程
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 修改账户余额
			this.setBalance(balance);
			// 输出现在的余额
			System.out.println("取款200后账户余额为 : " + this.getBalance());
		}

	}

	@Override
	public String toString() {
		return "Bank [账户 : " + account + ", 余额 : " + balance + "]";
	}

}
