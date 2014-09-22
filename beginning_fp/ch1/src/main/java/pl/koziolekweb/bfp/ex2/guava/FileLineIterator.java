package pl.koziolekweb.bfp.ex2.guava;

import com.google.common.base.Supplier;
import com.google.common.collect.AbstractIterator;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class FileLineIterator<T> extends AbstractIterator<T> {

	private Supplier<T> supplier;

	@Override
	protected T computeNext() {
		return supplier.get();
	}
}
