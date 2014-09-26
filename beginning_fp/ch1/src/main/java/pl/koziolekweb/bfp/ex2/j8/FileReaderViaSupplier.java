package pl.koziolekweb.bfp.ex2.j8;

import java.io.BufferedReader;
import java.util.function.Supplier;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class FileReaderViaSupplier<T> implements Supplier<T> {

	private BufferedReader reader;

	@Override
	public T get() {
		return null;
	}
}
