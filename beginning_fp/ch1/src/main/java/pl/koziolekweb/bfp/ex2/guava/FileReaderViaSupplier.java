package pl.koziolekweb.bfp.ex2.guava;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.io.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import static com.google.common.io.Files.newReader;
import static java.nio.charset.Charset.defaultCharset;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class FileReaderViaSupplier<T> implements Supplier<T>{

	private BufferedReader bufferedReader;

	@Override
	public T get() {
		return null;
	}
}
