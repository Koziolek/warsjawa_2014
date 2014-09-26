package pl.koziolekweb.bfp.ex3;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public interface Logger {

	enum Level {DEBUG, INFO, ERROR}

	void debug(String message);

	void info(String message);

	void error(String message);

	void log(Level lvl, String message);

}
