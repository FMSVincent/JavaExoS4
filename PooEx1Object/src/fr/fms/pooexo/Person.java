package fr.fms.pooexo;

import java.util.List;

/**
 * Exercice 1.8 : Crée la classe Person avec pour attributs nom, prénom, âge, adresse. Puis 
tester la dans une classe TestPerson en créant plusieurs instances puis afficher les afin 
d’obtenir le résultat suivant 

 Exercice 1.9 : Ajouter à votre classe Person un attribut « Ville de Naissance » qui est un 
objet de type City de sorte d’obtenir ce qui suit :
 */




public class Person {
	
	// 1.9
	private  City BornCity;
	private  String lastname;
	private  String firstname;
	private  int age;
	private  String address;
	/**
	 * @param address 
	 * @param age 
	 * @param firstname 
	 * @param lastname 
	 * @param city 
	 * 
	 */
	public Person(String lastname, String firstname, int age, String address, City BornCity) {
		setLastname(lastname);
		setFirstname(firstname);
		setAge(age);
		setAddress(address);
		setBornCity(BornCity);
	}
	
	public Person(String lastname, String firstname, int age) {
		setLastname(lastname);
		setFirstname(firstname);
		setAge(age);
	}
	
	/**
	 * 2.0
	 * display if live in france or born in paris
	 * @param personnages
	 */
	public static void treePersonByFranceOrBorninParis(List<Person> personnages) {
		for (int i = 0; i < personnages.size(); i++) {
			if(personnages.get(i).address.toLowerCase().contains("paris") || 
					personnages.get(i).BornCity.getCountry().toLowerCase().contains("france"))
			System.out.println(personnages+"\n");
		}
	}

	@Override
	public String toString() {
		String isResident = (BornCity.getTotalResident() > 0) ? " population "+ BornCity.getTotalResident() : "";
		String strInfos = (BornCity != null) ? "Person [lastname=" + lastname + ", " + "firstname=" + firstname + ", " +  " age=" + age +  ", " + "address=" + address + "]"
				+ " Borncity " + "[name=" + BornCity.getName() + ", " + "country="+ BornCity.getCountry()+ isResident +"]" 
				: "Person [lastname=" + lastname + ", " + "firstname=" + firstname + ", " +  " age=" + age +  ", " + "address=" + address + "]"
						+ " Borncitynull" ;
		return strInfos;
	}

	protected City getBornCity() {
		return BornCity;
	}

	protected void setBornCity(City bornCity) {
		BornCity = bornCity;
	}

	protected String getLastname() {
		return lastname;
	}

	protected void setLastname(String lastname) {
		this.lastname = lastname;
	}

	protected String getFirstname() {
		return firstname;
	}

	protected void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}
	

	

	

}
