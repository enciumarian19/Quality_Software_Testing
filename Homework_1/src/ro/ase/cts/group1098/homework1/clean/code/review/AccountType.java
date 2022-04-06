package ro.ase.cts.group1098.homework1.clean.code.review;

public enum AccountType {
	
	STANDARD(0), BUGET(1), PREMIUM(2), SUPER_PREMIUM(3); 
	private int type;
	
	private AccountType(int type) {
		this.type = type;
	}
	
	public int getAccountType() {
		return type;
	}
	
}
