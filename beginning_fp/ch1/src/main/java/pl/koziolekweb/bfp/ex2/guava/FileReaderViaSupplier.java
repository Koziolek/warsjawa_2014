package pl.koziolekweb.bfp.ex2.guava;

import com.google.common.base.Supplier;

import java.io.BufferedReader;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class FileReaderViaSupplier<T> implements Supplier<T> {

	private BufferedReader bucfferedReader;

	@Override
	public T get() {
		return null;
	}
}
