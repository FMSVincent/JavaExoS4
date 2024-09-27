package fr.fms.pooexo;

// 1.2 setup getters ans setters and properties change to private

import java.util.Scanner;

public class City {
	
	private Scanner sc = new Scanner(System.in);
	private String name;
	private String country;
	private long totalResident;
	// 1.7
	static int counter;
	
/**
	 * @param name
	 * @param country
	 * @param totalResident
	 */
	public City(String name, String country, long totalResident) {
		setCountry(country);
		setName(name);
		setTotalResident(totalResident);
		
		/**
		 * 1.7
		 */
		counter++;
	}
	
	public static void getCounterObject() {
		System.out.println(counter);
	}
	
	/**
	 * 1.3
	 * @param name
	 * @param totalResident
	 */
	public City(String name, long totalResident) {
		setName(name);
		setTotalResident(totalResident);
	}
	
	/**
	 * 1.9
	 * @param name
	 * @param country
	 */
	public City(String name, String country) {
		setName(name);
		setCountry(country);
	}
	

	/**
	 * reduce total Residents 1.2
	 * @param int This will serve to reduce the number of residents
	 */
	public void subResidents() {
		System.out.println("de combien souhaitez-vous reduire le nombre d'habitants ?");
		while(!sc.hasNextInt()) sc.next();
		long inputUser = sc.nextInt();
		if(inputUser > totalResident || inputUser < 0)
			throw new RuntimeException("le nombre total de residents ne peut etre  inferieur ou egal a 0");
		totalResident -= inputUser;
	}
	
	/**
	 * Exercice 1.4 : crée une méthode pour afficher les attributs d'une ville tel que 
		toulouse.display(); aura pour résultat : « ville de Toulouse en France ayant 450000 »
	 */
	public void display() {
		System.out.println("ville de " + name + " en " + country + " ayant " + totalResident);
	}
	
	/**
	 * 1.6
	 * ville de Toulouse en France ayant 450000 habitants
	 */
//	@Override
//	public String toString() {
//		return "ville de " + name + " en " + country + " ayant " + totalResident + " habitants "; 
//	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected String getCountry() {
		return country;
	}


	protected void setCountry(String country) {
		this.country = country;
	}


	protected long getTotalResident() {
		return totalResident;
	}


	protected void setTotalResident(long totalResident) {
		if(totalResident <= 0)
			throw new RuntimeException("ne peut etre inferieur ou egal a 0 !");
		this.totalResident = totalResident;

	}
	
}
