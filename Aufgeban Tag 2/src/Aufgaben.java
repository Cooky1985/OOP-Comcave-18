
public class Aufgaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Aufgabe 1
		
		double Liter = 0.035;
		if(Liter >= 1) {	//Asugabe in l
			System.out.println((int)Liter + " l");
		}
		else if(Liter >= 0.1) {		//Ausgabe in cl
			System.out.println((int)(Liter * 100) + " cl");
		}
		else if(Liter >= 0.001) {	// Ausgabe in ml
			System.out.println((int)(Liter * 1000) +  " ml");
			
		}
		else {		// Eingabe ist zu klein
			System.out.println("eingabe zu klein");
			
		}
	}
}