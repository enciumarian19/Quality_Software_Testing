package ro.ase.cts.group1098.clean.code.stage3;

public enum ProductType {
	// -> constant references
	NEW(1, 0), DISCOUNT(2, 0.15f), SALES(3, 0.25f), FINAL_SALES(4, 0.35f);

	int id;
	float discountValue;

	// the constructor of an enum is ALWAYS private
	private ProductType(int id, float discountValue) {
		this.id = id;
		this.discountValue = discountValue;
	}
	
	float getDiscount() {
		return this.discountValue;
	}
}
