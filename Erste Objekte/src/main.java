
public class main {

	public static void main(String[] args) {
		// derScanner = new Scanner(System.in);
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();

		auto1.marke = "Audi";
		auto1.modell = "A6";
		auto1.tankVolumen = 100;
		auto1.verbrauch = 6;
		auto2.marke = "Mercedes";
		auto2.modell = "C-Klasse";
		auto2.tankVolumen = 60;
		auto2.verbrauch = 5;
		auto3.marke = "BMW";
		auto3.modell = "3er";
		auto3.tankVolumen = 60;
		auto3.verbrauch = 7;

		auto1.serienNummer = "734jfkgh";
		auto2.serienNummer = "jfjdsjfn";
		auto3.serienNummer = "oofjiaii";
		auto1.anzahlSitze = 2;
		auto2.anzahlSitze = 4;
		auto3.anzahlSitze = 3;
		

//		auto1.druckeMarkeUndModell();
//		auto1.berechneReichweite();
//		auto1.druckeReichweite();
//		auto2.druckeMarkeUndModell();
//		auto2.berechneReichweite();
//		auto2.druckeReichweite();
//		auto3.druckeMarkeUndModell();
//		auto3.berechneReichweite();
//		auto3.druckeReichweite();

		auto1.druckeInfo();
		auto2.druckeInfo();
		auto3.druckeInfo();
	}
}
