
public class Rechner {

	//Atribute
	// Brauchen wir hier keine
	
	// Methoden
	//Addition
	//R�ckgabewert double => Ergebnis soll vom Typ double zur�ckgegeben werden
	//Warum?
	//Wir wollen auch mit Kommazahlen rechnen k�nnen.
	//Wir brauchen zwei parameter, die beiden Zahlen, die wir addieren wollen.
	double addiere(double eingabe1,double eingabe2) {
		return eingabe1 + eingabe2;
		
	}
	
	//Subtraktion
	double subtrahiere(double eingabe1, double eingabe2) {
		return eingabe1 - eingabe2;
	}
	// Multiplikation
	double multipliziere(double eingabe1, double eingabe2) {
		return eingabe1 * eingabe2;
	}
	
	// Division
	double dividiere(double eingabe1, double eingabe2) {
		return eingabe1 / eingabe2;
	}
	
	//Rest-Bestimmung (Modulo
	double modulo(double eingabe1, double eingabe2) {
		return eingabe1 % eingabe2;
	}
}
