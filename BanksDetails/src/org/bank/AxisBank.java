package org.bank;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("Deposit the amount in AxisBank");
	}

	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.current();
		a.deposit();
		a.savings();
	}
}
