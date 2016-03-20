package homework;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Input {
	/**
	 * @author Yura
	 */

	/**
	 * @author Ivan
	 */

	/**
	 * Display information about a member of the club to the console
	 * @param name
	 */
	public void infoAboutClubMember(ClubMember name) {
		System.out.println("The name of the member of the club - " + name);
	}

	/**
	 * Display information about a member's pets to the console
	 * @param name
	 * @param zooclub
	 */
	public void infoAboutClubMembersPets(ClubMember name, Map<ClubMember, ArrayList<Pet>> zooclub) {
		for(Map.Entry<ClubMember, ArrayList<Pet>> zoo: zooclub.entrySet()) {
			if(zoo.getKey().equals(name)) {
				System.out.println(zoo.getValue());
			}
		}
	}

	/**
	 * Display information about a specific pet
	 */
	public void infoAboutPet() {

	}

}
