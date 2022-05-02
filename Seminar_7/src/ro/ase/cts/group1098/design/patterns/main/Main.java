package ro.ase.cts.group1098.design.patterns.main;

import ro.ase.cts.group1098.design.patterns.models.SuperPower;
import ro.ase.cts.group1098.design.patterns.models.Superhero;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		//Superhero superman = new Superhero();
		
		Superhero qiyana = 
				new Superhero.SuperheroBuilder("Qiyana", "Qiyana.3d")
				.setPositive()
				.setLifePoints(1600)
				.setSuperPower(SuperPower.MIND_CONTROL)
				.build();
		
		Superhero talon = (Superhero) qiyana.clone();
		
	}

}
