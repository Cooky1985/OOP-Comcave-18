import java.util.Scanner;

//import com.sun.java.util.jar.pack.Instruction.Switch;
public class Eingaben {

	public static void main(String[] args) {
//		String meinText ="Beispiel Text";
//		System.out.println(meinText);
//		
		Scanner derScanner = new Scanner(System.in);
//		
//		//String meineEingabe = eingabe von der Konsole Übernehmen
//		System.out.print("Engabe:");
//		String meineEingabe = derScanner.nextLine();
//		// String Eingaben mit .nextLine();
//		// Scanner wartet auf Eingabe und Enter
//		System.out.println("Unsere Eingabe lautet:" + meineEingabe);
//		
//		System.out.print("Engabe:");
//		int meineZahl = derScanner.nextInt();
//		// Int Eingaben mit .nextInt();
//		System.out.println("Unsere Zahl lautet: " + meineZahl);
//		
//		System.out.print("Eingabe:");
//		int zahl = derScanner.nextInt();
//		System.out.println("Die Quadrahtzahl von " + zahl + " ist " + zahl*zahl);
//		
//		
//		System.out.print("Eingabe 1:");
//		int meine1Zahl = derScanner.nextInt();
//		
//		System.out.print("Eingabe 2:");
//		int meine2Zahl = derScanner.nextInt();
//		
//		System.out.println("das Ergebnis von " +  meine1Zahl + " und " + meine2Zahl + " ist " +(meine1Zahl + meine2Zahl));
	
		
		// Eingabe annehmen als int Wert
		// Qadraht bilden (mit sich selbst multiplizieren
		//"Die Quadratzahl von 4 is 16" ausgeben
//		System.out.print("kommazahlen einlesen: ");
//		double kommaZahl = derScanner.nextDouble();
//		// In der Konsole müssen wir das Kommazeichen(,)verwenden, im Programmcode einen Punkt (.)
//		System.out.println(kommaZahl);
		
		//Char
//		System.out.println("Zeichen einlesen");
//		char meinZeichen = derScanner.nextLine().charAt(0);
//		System.out.println("Das Zeichen lautet = " + meinZeichen);
		
		// Eingabe Zahl1, auswahl Operator, Eingabe Zahl2, Ausgabe Ergebnis
		System.out.println("Rechner");
		System.out.println("Eingabe Zahl1");
		double z1 =derScanner.nextDouble();
	
//		int z1 = ...
		System.out.println("Eingabe Operator");
		String s = derScanner.nextLine();
		int Operator = derScanner.nextLine().charAt(0);
//		int operator = ...
		System.out.println("Eingabe Zahl2");
		double z2 =derScanner.nextDouble();	
//		int z2 = ...
		switch (Operator) {
		case '+':
			System.out.println("Ergebnis = " + (z1 + z2));
            break;

        case '-':
        	System.out.println("Ergebnis = " + (z1 - z2));
            break;

        case '*':
            System.out.println("Ergebnis = " + (z1 * z2));
            break;

        case '/':
            System.out.println("Ergebnis = " + (z1 / z2));
            break;
        case '%':
        	System.out.println("Ergebnis = " + (z1 % z2));
			break;

		default:
			System.out.println("Fehleingabe");
			break;
		}
		
/*//		wenn +
		wenn -
		wenn *
		wenn /
		wenn %
		
		switch case
*/	
		
	}

}
