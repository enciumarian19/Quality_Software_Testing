package ro.ase.cts.group1098.clean.code.stage6.models.marketing;

import ro.ase.cts.group1098.clean.code.stage6.interfaces.MarketingStrategyInterface;

public class SummerAccountMarketingStrategy implements MarketingStrategyInterface {

	@Override
	public float getAccountDiscount(int accountAgeInYears) {
		return 0.2f;
	}

}
