package ro.ase.cts.g1098.laboratory1.exceptions;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String msg) {
		super(msg);
	}
	
	public InsufficientFundsException () {
		//super(); -> we get it by default
	}
}
