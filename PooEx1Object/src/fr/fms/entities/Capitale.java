package fr.fms.entities;

import fr.fms.pooexo.City;

public class Capitale extends City {
	
	private String monuments;

	public Capitale(String name, String country, long totalResident, String monuments) {
		super(name, country, totalResident);
		setMonuments(monuments);
	}

	public String getMonuments() {
		return monuments;
	}

	public void setMonuments(String monuments) {
		this.monuments = monuments;
	}

}
