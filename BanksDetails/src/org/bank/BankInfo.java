package org.bank;

public class BankInfo {
	public void savings() {
		System.out.println("Account is Savings Account");
	}

	public void current() {
		System.out.println("Account is Current Account");
	}

	public void deposit() {
		System.out.println("Deposit amount is fixed");
	}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.current();
	b.savings();
	b.deposit();
}
}
