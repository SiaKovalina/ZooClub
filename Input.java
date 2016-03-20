package homework;

import java.util.ArrayList;
import java.util.HashMap;
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
	 
	public String scanToString (){
		Scanner re = new Scanner(System.in);
		String line = re.nextLine();
		return line;
		
	}
	/**
	 * This method add new club member to class ClubMember
	 * 
	 * @param key 
	 */
	
	public ClubMember newClubMember(int key){
		Map<Integer, ClubMember> map = new HashMap<Integer, ClubMember>();
		Input sc = new Input();
		System.out.println("Enter name");
		String name = sc.scanToString();
		return map.put(key, new ClubMember(name));
		
	}
	
	/**
	 * This method add new Pet to class Pet
	 * 
	 * @param key 
	 */
	public Pet newPet(int key){
		Map<Integer, Pet> map = new HashMap<Integer, Pet>();
		Input sc = new Input();			
		System.out.println("Enter name of pet");
		String name = sc.scanToString();
		System.out.println("Enter species of pet");
		String species = sc.scanToString();
		return map.put(key, new Pet(name, species));
		
	}
	/**
	 * This method remove Pet with class Pet
	 * 
	 * @param key 
	 */
	public Pet removePet(int key){
		Map<Integer, Pet> map = new HashMap<Integer, Pet>();
		return map.remove(key);
		
	}
	
	/**
	 * This method remove clubMember with class ClubMember
	 * 
	 * @param key 
	 */
	public ClubMember removeClubMember(int key){
		Map<Integer, ClubMember> map = new HashMap<Integer, ClubMember>();
		return map.remove(key);
		
	}
	
	
	
	
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
