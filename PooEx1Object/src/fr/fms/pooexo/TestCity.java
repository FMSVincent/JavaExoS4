package fr.fms.pooexo;

public class TestCity {



	
	public static void main(String[] args) {
		
		// 1.1
		
		City toulouse = new City ("Toulouse", "France", 101100110);
		City paris = new City ("Paris", "France", 101110010);
		City strasbourg = new City ("Strasbourg", "France", 101100001);
		City lyon = new City ("Nice", "France", 101101110);
		City marseille = new City ("Nice", "France", 101100011);
		City avignon = new City ("Nice", "France", 101100101);
		
		// 1.1 if public properties display
		
//		System.out.println(toulouse.name, toulouse.country, toulouse.totalResident);
//		System.out.println(paris.toString());
//		System.out.println(strasbourg.toString());
//		System.out.println(lyon.toString());
//		System.out.println(marseille.toString());
//		System.out.println(avignon.toString());
//		
//		// add 20000k residents to toulouse
//		toulouse.totalResident += 20000;
//		System.out.println(toulouse.getName()+ " " + toulouse.getCountry() + " " + toulouse.getTotalResident());
		
		// 1.2 display with getters 
		// System.out.println(toulouse.getName()+ " " + toulouse.getCountry() + " " + toulouse.getTotalResident());
		// impossible because properties is privates
		// toulouse.totalRFesidents = -200
		// use setter
		// toulouse.setTotalResident(-200);
		// reduce residents
		// toulouse.subResidents();
		// System.out.println(toulouse.getTotalResident());
		
//		// 1.3
//		City rabbat = new City("Rabat", 577000);
//		System.out.println(rabbat);
//		rabbat.setCountry("Maroc");
//		System.out.println(rabbat);
		
		//  1.4
		// toulouse.display();
		
		// 1.5 que se passe t-il ici ? System.out.println(toulouse); Pourquoi ?
		// display properties and values and class
		// System.out.println(toulouse);
		
		// 1.6 uncomment tostring()
		// System.out.println(toulouse);
		
		// 1.7 counter object
		// City.getCounterObject();
	}

}
