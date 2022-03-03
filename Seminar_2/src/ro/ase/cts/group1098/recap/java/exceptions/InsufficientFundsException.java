package ro.ase.cts.group1098.recap.java.exceptions;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException (String msg) {
		super(msg);
	}
	
	public InsufficientFundsException() {
		super(); //by default
	}
	
}
