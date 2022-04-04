package ro.ase.cts.group1098.design.patterns.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import ro.ase.cts.group1098.design.patterns.exceptions.MissingInputArgException;
import ro.ase.cts.group1098.design.patterns.interfaces.ILogging;

public class Logger implements ILogging {
	
	private static Logger logger;
	
	private String fileName;
	private String messagePattern;
	private File logFile;
	
	private Logger(String fileName, String messagePattern) throws MissingInputArgException, IOException {
		
		if (fileName == null || fileName.length() < 4) {
			
			throw new MissingInputArgException();
			
		}
		
		this.fileName = fileName;
		this.messagePattern = messagePattern != null ? messagePattern : "";
		
		this.logFile = new File(this.fileName);
		
		if (!this.logFile.exists()) {
			this.logFile.createNewFile();
		}
	}

	@Override
	public void log(String message) {
		
		String log = String.format("%s (%s) - %s", 
				this.messagePattern, 
				LocalDateTime.now().toString(),
				message);
		
		try {
			FileWriter fileWriter = new FileWriter(logFile, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(log);
			
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// default access level for classes in the same package
	public static ILogging getLogger(String fileName, String pattern) throws MissingInputArgException, IOException {
		
		if (logger == null) {
			logger = new Logger(fileName, pattern);
		}
		
		return logger;
		
	}
	
}
