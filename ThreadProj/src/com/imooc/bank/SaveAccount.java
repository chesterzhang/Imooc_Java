package com.imooc.bank;

public class SaveAccount implements Runnable {
	Bank bank;

	public SaveAccount(Bank bank) {
		super();
		this.bank = bank;
	}

	@Override
	public void run() {
		this.bank.saveMoney();
	}

}
