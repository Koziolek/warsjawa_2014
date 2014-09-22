package pl.koziolekweb.bfp.ex2.guava;

import com.google.common.collect.AbstractIterator;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class FileLineIterator extends AbstractIterator<String> {

	private FileReaderViaSupplier supplier;

	@Override
	protected String computeNext() {
		return supplier.get();
	}
}
