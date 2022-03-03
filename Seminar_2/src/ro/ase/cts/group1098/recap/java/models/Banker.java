package ro.ase.cts.group1098.recap.java.models;

import ro.ase.cts.group1098.recap.java.exceptions.IllegalTransferException;

public class Banker {

	private int nextId = 1;
	private String bankName;
	
	public Banker(String bankName) {
		super();
		this.bankName = bankName;
	}
	
	public BankAccount openAccount(AccountType type) throws IllegalTransferException {
		String iban = bankName + nextId;
		this.nextId += 1;
		switch (type) {
		case CURRENT:
			return new CurrentAccount(iban);
		case SAVINGS:
			return new SavingsAccount(iban);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
