import java.util.Scanner;

public class Demo {
	public static void main (String[]args){
		Klant pietje = new Klant();
		RestaurantRuimte deSmikkel = new RestaurantRuimte();
		pietje.binnenkomen();
		System.out.println("Er zijn "+ deSmikkel.barkrukken + " krukken beschikbaar!");
		System.out.println("Er zijn "+ deSmikkel.tafels + " tafels beschikbaar! ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 voor bar 2 voor tafel");
		int invoer = sc.nextInt();
		switch(invoer) {
		case 1:
			System.out.println("Klant gaat aan de bar zitten");
			break;
		case 2:
			System.out.println("Klant gaat aan de tafel zitten");
			break;
		default: 
			System.out.println("maak andere keuze");
		}
		
	}
}
class Klant{
	void binnenkomen() {
		System.out.println("Welkom nieuwe klant");
	}
}

class RestaurantRuimte{
	static int barkrukken = 8;
	static int tafels = 10;
}