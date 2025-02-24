package fr.fms.pooexo;

import java.util.ArrayList;

public class TestPerson {

	static ArrayList<Person> personnages = new ArrayList<Person>();
	
	public static void main(String[] args) {
//		// 1.9
//		Person manu = new Person("Macron", "Manu", 43, "Elysee a paris", new City("Amien", "France"));
//		Person poutine = new Person("Poutine", "vladimir", 68);
//
//		System.out.println(manu);
//		System.out.println(poutine);
		
		// 2.0
		Person manu = new Person("Macron", "Manu", 43, "Elysee a paris", new City("Amien", "France"));
		Person sarko = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		Person johnson = new Person("johnson", "Boris", 56, "Dowing street a london", new City("New York", "USA"));
		Person depardieu = new Person("Depardieu", "Gerard", 72, "Moscou", new City("Chateauroux", "France"));
		Person kravitz = new Person("Kravitz", "Lenny", 56, "Hotel particulier a Paris", new City("New york", "USA"));
		Person lawrence = new Person("Lawrence", "Jennifer", 30, "louis ville aux USA", new City("Indian hills", "USA"));
		
		personnages.add(lawrence);
		personnages.add(manu);
		personnages.add(sarko);
		personnages.add(johnson);
		personnages.add(depardieu);
		personnages.add(kravitz);
		
		Person.treePersonByFranceOrBorninParis(personnages);
	}

}
