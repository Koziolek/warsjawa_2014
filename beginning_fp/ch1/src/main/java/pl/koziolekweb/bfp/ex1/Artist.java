package pl.koziolekweb.bfp.ex1;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class Artist {

	private String name;

	public Artist(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Artist setName(String name) {
		return new Artist(name);
	}
}
