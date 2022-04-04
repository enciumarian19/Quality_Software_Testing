package ro.ase.cts.group1098.design.patterns.main;

import ro.ase.cts.group1098.design.patterns.interfaces.ILogging;
import ro.ase.cts.group1098.design.patterns.models.LoggerGenerator;
import ro.ase.cts.group1098.design.patterns.models.LoggerType;

public class Main {

	public static void main(String[] args) {

		ILogging errorLog = LoggerGenerator.getLogger(LoggerType.ERROR);
		errorLog.log("Hello !");
		
		//we have a bug
		// we can't have the singleton and the singleton registry in the 2 different classes
		
		ILogging infoLog = LoggerGenerator.getLogger(LoggerType.INFO);
		
		
		System.out.println("The end");
		
	}

}
