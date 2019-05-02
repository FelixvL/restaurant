public class Demo {
	public static void main (String[]args){
		Klant pietje = new Klant();
		pietje.binnenkomen();
	}
}
class Klant{
	void binnenkomen() {
		System.out.println("Welkom nieuwe klant");
	}
}