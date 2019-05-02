import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	public static void main (String[]args){
		Klant pietje = new Klant("Pietje");
		RestaurantRuimte deSmikkel = new RestaurantRuimte();
		Scanner sc = new Scanner(System.in);
		deSmikkel.gastheerVraag(pietje);
		
		
	}
	

}

class Klant{
	String naam;
	Klant(String naam){
		this.naam = naam;
	}
	void binnenkomen() {
		System.out.println("Welkom nieuwe klant: "+naam);
	}
}

class RestaurantRuimte{
	int barkrukken = 2;
	int tafels = 3;
	Scanner sc = new Scanner(System.in);
	Menu menu = new Menu();
	
	void bezoeken() {
		System.out.println("1 voor bar 2 voor tafel");
		int plek = sc.nextInt();
		switch (plek) {
		case 1:
			if (barkrukken == 0) {
				System.out.println("Er zijn geen barkrukken");
			} else {
				System.out.println("Klant gaat aan de bar zitten");
				barkrukken--;
			}
			break;
		case 2:
			if (tafels == 0) {
				System.out.println("Er zijn geen tafels");
			} else {
				System.out.println("Klant gaat aan de tafel zitten");
				menu.tonen();
				
				tafels--;
			}
			break;
		default:
			System.out.println("maak andere keuze");
		}
	}
	
	void gastheerVraag(Klant klant) {
		boolean doorgaan = true;
		while(doorgaan) {
			System.out.println("Is er een klant?");
			System.out.println("ja(j) nee(n) stoppen(s)");
			String isErEenKlant = sc.next();
			switch(  isErEenKlant.toLowerCase().charAt(0)  ) {
			case 'j':
				klant.binnenkomen();
				System.out.println("Er zijn "+ barkrukken + " krukken beschikbaar!");
				System.out.println("Er zijn "+ tafels + " tafels beschikbaar! ");
				bezoeken();
				break;
			case 'n':
				continue;
			case 's':
				doorgaan = false;
			}
			
		}
		
	}
}
class Menu{
	ArrayList<Gerecht> gerechten = new ArrayList();
	Menu(){
		Gerecht s = new Gerecht();
		s.beschrijving = "Spaghetti";
		gerechten.add(s);
		Gerecht s1 = new Gerecht();
		s1.beschrijving = "Hamburger Speciaal";
		gerechten.add(s1);
	}
	void tonen() {
		for(Gerecht elem : gerechten) {
			System.out.println(elem.beschrijving);
		}
	}
	
}
class Gerecht{
	String beschrijving;
	boolean alergieWaarschuwing;
	int prijs;
}



















