package pl.koziolekweb.bfp.ex3;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public interface Logger<T> {

	void debug(T t);

	void info(T t);

	void error(T t);

}
