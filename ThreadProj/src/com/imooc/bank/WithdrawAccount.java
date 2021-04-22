package com.imooc.bank;

public class WithdrawAccount implements Runnable {
	
	Bank bank;

	public WithdrawAccount(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		this.bank.withdrawMoney();
	}

}
