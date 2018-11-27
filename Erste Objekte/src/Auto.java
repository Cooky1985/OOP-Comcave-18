
public class Auto {
	//Atriebutte = Eigenschaften
	String marke;
	String modell;
	String serienNummer;
	int kw;
	int hubRaum;
	int anzahlSitze =5 ;
	int tankVolumen;
	int reichweite;
	int verbrauch;
	
	// Methoden = Fähigkeiten
	void druckeMarkeUndModell() {
		System.out.println(marke + " " + modell);
		System.out.println(serienNummer);
	
	}
	void berechneReichweite() {
		reichweite = (tankVolumen / verbrauch) *100;
	}
	void druckeReichweite() {
		System.out.println(reichweite + " km");		
		
	}
	
	void druckeInfo() {
		
		druckeMarkeUndModell();
		berechneReichweite();
		druckeReichweite();
		System.out.println(anzahlSitze + " Sitze");
		System.out.println();
	}

}
	