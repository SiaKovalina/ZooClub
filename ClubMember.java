package homework;

import java.util.*;

public class ClubMember {
	
	String name;
	
	ArrayList<Pet> pets  = new ArrayList<Pet>();

	public ClubMember(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
