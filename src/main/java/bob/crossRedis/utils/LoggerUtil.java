package bob.crossRedis.utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {

	private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());

	private static Handler consoleHandler;
	private static Handler fileHandler;
	private static Formatter simpleFormatter = new SimpleFormatter();

	public static Logger getLogger(Class clazz) {
		Logger logger = Logger.getLogger(clazz.getName());
		logger.addHandler(consoleHandler);
		logger.addHandler(fileHandler);
		logger.setLevel(Level.ALL);
		return logger;
	}

	static {
		try {
			// log format
			System.setProperty("java.util.logging.SimpleFormatter.format",
				"[%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL] [%4$-7s] [%3$s] (%2$s) %5$s %6$s%n");

			// create log folder
			String logFolder = createLogDir();

			// config log handler and levels
			consoleHandler = new ConsoleHandler();
			consoleHandler.setLevel(Level.ALL);
			consoleHandler.setFormatter(simpleFormatter);

			String logFile = new StringBuilder(logFolder).append(File.separator).append("crossRedis.log").toString();
			fileHandler = new FileHandler(logFile, true);
			fileHandler.setLevel(Level.ALL);
			fileHandler.setFormatter(simpleFormatter);


		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", e);
		}
	}

	private static String createLogDir() {
		StringBuilder sb = new StringBuilder();
		sb.append(System.getProperty("user.home")).append(File.separator)
			.append(".crossRedis").append(File.separator)
			.append("logs").append(File.separator);
		String logFolder = sb.toString();
		File file = new File(logFolder);
		if (file.exists()) {
			if (!file.isDirectory()) {
				file.delete();
			}
		} else {
			file.mkdirs();
		}
		return logFolder;
	}


}
