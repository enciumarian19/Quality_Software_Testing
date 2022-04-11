package ro.ase.cts.group1098.homework1.clean.code.review;

import ro.ase.cts.group1098.homework1.clean.code.exceptions.ArgOutOfRangeException;

public final class Account {
	public double loanValue, rate;
	public int daysActive, accountType;
	public static float brokersFee = 0.0125F;

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

	public static double computeAnnualInterestRate(Account[] accounts) {
		Account account;
		double annualInterestRate = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			annualInterestRate =  Math.pow(account.rate, (account.daysActive) / 365);
		}
		
		return annualInterestRate;
				
	}
	
	public static double calculate(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == AccountType.PREMIUM.getAccountType() || 
					account.accountType == AccountType.SUPER_PREMIUM.getAccountType())
				totalFee += brokersFee * ( // 1.25% broker's fee
				account.loanValue * computeAnnualInterestRate(accounts)); // interest-principal
		}
		return totalFee;
	}

	
	// the constructor
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
