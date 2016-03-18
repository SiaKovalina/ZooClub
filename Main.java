package homework;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Map<ClubMember, ArrayList<Pet>> zooclub = new HashMap<ClubMember, ArrayList<Pet>>();
		
		ClubMember ivan = new ClubMember();

		Pet ivansFirstPet = new Pet("Mark", "cat");
		Pet ivansSecondPet = new Pet("Mark", "fish");
		Pet ivansThirdPet = new Pet("Mark", "dog");
		Pet ivansForthPet = new Pet("Mark", "hamster");

		ivan.pets.add(ivansFirstPet);
		ivan.pets.add(ivansSecondPet);
		ivan.pets.add(ivansThirdPet);
		ivan.pets.add(ivansForthPet);
		
		ArrayList<Pet> ivansPets = ivan.pets;
		
		zooclub.put(ivan, ivansPets);
		

	}

}
