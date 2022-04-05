package ro.ase.cts.group1098.homework1.clean.code.review;

import ro.ase.cts.group1098.homework1.clean.code.exceptions.ArgOutOfRangeException;

public class Account {
	public double loanValue, rate;
	public int daysActive, accountType;
	public static final int STANDARD = 0, BUDGET = 1, PREMIUM = 2, SUPER_PREMIUM = 3;

	public double loan() {
		System.out.println("The loan value is ");
		return this.loanValue;
	}

	public double getRate() {
		System.out.println("The rate is ");
		return this.rate;
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue * rate;
	}

	public void setValue(double value) throws Exception {
		if (value < 0)
			throw new ArgOutOfRangeException();
		else {
			loanValue = value;
		}
	}

	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ accountType + ";";
	}

	public void print() {
		System.out.println("This is an account");
	}

	public static double calculate(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == Account.PREMIUM || account.accountType == Account.SUPER_PREMIUM)
				totalFee += .0125 * ( // 1.25% broker's fee
				account.loanValue * Math.pow(account.rate, (account.daysActive / 365)) - account.loanValue); // interest-principal
		}
		return totalFee;
	}

	public Account(double value, double rate, int accountType) throws Exception {
		if (value < 0)
			throw new ArgOutOfRangeException();
		else {
			loanValue = value;
		}
		this.rate = rate;
		this.accountType = accountType;
	}

}
