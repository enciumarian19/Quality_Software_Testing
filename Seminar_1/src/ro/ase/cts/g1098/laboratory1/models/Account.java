package ro.ase.cts.g1098.laboratory1.models;

import ro.ase.cts.g1098.laboratory1.exceptions.IllegalTransferException;

public abstract class Account {

	public abstract void withdraw (double amount) throws IllegalTransferException;
	public abstract void deposit (double amount);
	public abstract void transfer (Account desination, double amount);
	public abstract double getBalance();
	
}
