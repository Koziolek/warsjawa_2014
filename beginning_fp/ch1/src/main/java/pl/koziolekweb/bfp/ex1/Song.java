package pl.koziolekweb.bfp.ex1;

import java.time.Duration;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class Song {

	private String name;

	private Duration duration;

	private Artist textAuthor;

	private Artist musicAuthor;

	public Song(String name, Duration duration, Artist textAuthor, Artist musicAuthor) {
		this.name = name;
		this.duration = duration;
		this.textAuthor = textAuthor;
		this.musicAuthor = musicAuthor;
	}

	public String getName() {
		return name;
	}

	public Duration getDuration() {
		return duration;
	}

	public Artist getTextAuthor() {
		return textAuthor;
	}

	public Artist getMusicAuthor() {
		return musicAuthor;
	}

	public Song setName(String name) {
		return new Song(name, duration, textAuthor, musicAuthor);
	}

	public Song setDuration(Duration duration) {
		return new Song(name, duration, textAuthor, musicAuthor);

	}

	public Song setTextAuthor(Artist textAuthor) {
		return new Song(name, duration, textAuthor, musicAuthor);
	}

	public Song setMusicAuthor(Artist musicAuthor) {
		return new Song(name, duration, textAuthor, musicAuthor);
	}
}
