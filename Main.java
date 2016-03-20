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
		
		ClubMember john = new ClubMember("John");

		Pet johnsFirstPet = new Pet("Lucky", "cat");
		Pet johnsSecondPet = new Pet("Lucky", "fish");
		Pet johnsThirdPet = new Pet("Lucky", "dog");
		Pet johnsForthPet = new Pet("Lucky", "hamster");
		Pet johnsFifthPet = new Pet("Lucky", "parrot");

		john.pets.add(johnsFirstPet);
		john.pets.add(johnsSecondPet);
		john.pets.add(johnsThirdPet);
		john.pets.add(johnsForthPet);
		john.pets.add(johnsFifthPet);
		
		ArrayList<Pet> johnsPets = john.pets;
		
		zooclub.put(john, johnsPets);
		
		ClubMember nick = new ClubMember("Nick");

		Pet nicksFirstPet = new Pet("Balu", "cat");
		Pet nicksSecondPet = new Pet("Tom", "cat");
		Pet nicksThirdPet = new Pet("Spike", "dog");
		Pet nicksForthPet = new Pet("Jerry", "hamster");
		Pet nicksFifthPet = new Pet("Paco", "parrot");

		nick.pets.add(nicksFirstPet);
		nick.pets.add(nicksSecondPet);
		nick.pets.add(nicksThirdPet);
		nick.pets.add(nicksForthPet);
		nick.pets.add(nicksFifthPet);
		
		ArrayList<Pet> nicksPets = john.pets;
		
		zooclub.put(nick, nicksPets);
		
		ClubMember splinter = new ClubMember("Splinter");

		Pet splintersFirstPet = new Pet("Leonardo", "turtle");
		Pet splintersSecondPet = new Pet("Donatello", "turtle");
		Pet splintersThirdPet = new Pet("Raphael", "turtle");
		Pet splintersForthPet = new Pet("Michelangelo", "turtle");

		splinter.pets.add(splintersFirstPet);
		splinter.pets.add(splintersSecondPet);
		splinter.pets.add(splintersThirdPet);
		splinter.pets.add(splintersForthPet);
		
		ArrayList<Pet> splintersPets = splinter.pets;
		
		zooclub.put(splinter, splintersPets);
		
		ClubMember bart = new ClubMember("Bart");

		Pet bartsFirstPet = new Pet("Billy", "duck");
		Pet bartsSecondPet = new Pet("Villy", "duck");
		Pet bartsThirdPet = new Pet("Dilly", "duck");
		Pet bartsForthPet = new Pet("Abu", "monkey");
		Pet bartsFifthPet = new Pet("Lucy", "monkey");

		bart.pets.add(bartsFirstPet);
		bart.pets.add(bartsSecondPet);
		bart.pets.add(bartsThirdPet);
		bart.pets.add(bartsForthPet);
		bart.pets.add(bartsFifthPet);
		
		ArrayList<Pet> bartsPets = bart.pets;
		
		zooclub.put(bart, bartsPets);
	}

}
