package pl.koziolekweb.bfp.ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class Album {

	private Band band;

	private String name;

	private LocalDate time;

	private List<Song> songs;

	public Album(Band band, String name, LocalDate time, Collection<Song> songs) {
		this.band = band;
		this.name = name;
		this.time = time;
		this.songs = Collections.unmodifiableList(new ArrayList(songs));
	}

	public Band getBand() {
		return band;
	}

	public String getName() {
		return name;
	}

	public LocalDate getTime() {
		return time;
	}

	public Collection<Song> getSongs() {
		return songs;
	}

	public Album setBand(Band band) {
		return new Album(band, name, time, songs);
	}

	public Album setName(String name) {
		return new Album(band, name, time, songs);
	}

	public Album setTime(LocalDate time) {
		return new Album(band, name, time, songs);
	}

	public Album addNewSong(Song song) {
		ArrayList newSongSet = new ArrayList();
		Collections.copy(newSongSet, songs);
		newSongSet.add(song);
		return new Album(band, name, time, newSongSet);
	}
}
