package pl.koziolekweb.bfp.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * User: koziolek
 */
public class Band {

	private String name;

	private List<Artist> members;

	public Band(String name, Artist... members) {
		this(name, Arrays.asList(members));
	}

	public Band(String name, Collection<Artist> members) {
		this.members = Collections.unmodifiableList(new ArrayList<Artist>(members));
		this.name = name;
	}

	public Band addMember(Artist newMember) {
		Artist[] a = new Artist[members.size() + 1];
		members.toArray(a);
		a[a.length - 1] = newMember;
		return new Band(name, a);
	}

	public void setName(String name) {
		new Band(name, members);
	}
}
