package conceptsAfterBreak;

public class Demo {
	
	public static void main(String[] args) {
		Boom b = new Boom();
		b.vallenBlaadjes(2);
		b.vallenBlaadjes();
		b.aantalBlaadjes = 300;
		
		Hovenier h = new Hovenier();
		h.voornaam = "Piet";
		h.eenBoomSnoeien(b);
		
	}

}

class Hovenier{
	String voornaam;
	
	void eenBoomSnoeien( Boom deBoom ) {
		System.out.println("aantal blaadjes voor het snoeien: " + deBoom.aantalBlaadjes);
		deBoom.aantalBlaadjes = deBoom.aantalBlaadjes/2;
		System.out.println("aantal blaadjes na het snoeien: " + deBoom.aantalBlaadjes);
	}
}

class Boom{
	int aantalBlaadjes;
	
	void vallenBlaadjes() {
		
	}
	
	void vallenBlaadjes(int a) {
		
	}
}