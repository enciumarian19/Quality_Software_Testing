package ro.ase.cts.group1098.design.patterns.models;

import java.io.IOException;
import java.util.HashMap;

import ro.ase.cts.group1098.design.patterns.exceptions.MissingInputArgException;
import ro.ase.cts.group1098.design.patterns.interfaces.ILogging;

public class LoggerGenerator {
	
	private static HashMap<LoggerType, ILogging> loggers = new HashMap<>();
	
	public static ILogging getLogger(LoggerType type) {
		
		ILogging logger = loggers.get(type);
		if (logger == null) {
			try {
				logger = Logger.getLogger(type.getFileName(), type.getLogPattern());
				loggers.put(type, logger);
			} catch (IOException | MissingInputArgException e){
				e.printStackTrace();
			}
		}
		
		return logger;
		
	}
	
}
