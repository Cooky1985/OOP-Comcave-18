import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Taschenrechner objektorientiert erstellen
		// *
		/*
		 * Wir brauchen dazu : - Einen Scanner , um Eingaben anzunehmen. -Eine Objekt
		 * von unserer Klasse rechner -eine Schleife, in der unser Programm ausgeführt
		 * wird - verschiedene methoden in rechner um... ..zu addieren ..zu subtrahieren
		 * ..zu multiplizieren .. zu dividieren den rest eine Division zu bestimmen
		 * 
		 * - die se Methoden einen rückgabe wert besitzen -Dort soll das ergebnis
		 * zurückgegeben werden -Wir wollen das ergebenis auf der Konsole ausgeben 4+9
		 * =13 8*8 =64
		 */
		// Wir erstellen ein Objekt derScanner

		Scanner derScanner = new Scanner(System.in);

		// Wir erstellen ein Objekt derRechner der Klasse Rechner
		Rechner derRechner = new Rechner();

		// Begrüßungstext
		System.out.println("Willkommen beim SuperDuperRechner V1.0");
		System.out.println();
		// Eine Schleife in der unser Programm ausgeführt wird.
		// wir wollen eine Dauerschleife

		while (true) {
			// Alles hier drin, wird solange ausgeführt
			// bis wir das programm beenden

			System.out.println("Welche Rechenoperation möchtest du Ausführen?");
			System.out.println(" + Addition");
			System.out.println(" - Subtraktion");
			System.out.println(" * Multiplikation");
			System.out.println(" / Division");
			System.out.println(" %  Rest Bestimmung");

			// Lese Operation ein
			System.out.print("Operation: ");
			char operator = derScanner.next().charAt(0);
			System.out.print("Zahl 1:  ");
			double eingabe1 = derScanner.nextDouble();
			System.out.print("Zahl 2:  ");
			double eingabe2 = derScanner.nextDouble();	

			// Rufe entschprechende Methode auf

			
			System.out.print("Ergebnis = ");
			
			switch (operator) {
			// +
			case '+':
				System.out.println(derRechner.addiere(eingabe1, eingabe2));
				break;

				
			// -
			case '-':
				System.out.println(derRechner.subtrahiere(eingabe1, eingabe2));
				break;
			// *
			case '*':
				System.out.println(derRechner.multipliziere(eingabe1, eingabe2));
				break;
			// /
			case '/':
				System.out.println(derRechner.dividiere(eingabe1, eingabe2));
				break;
			// %
			case '%':
				System.out.println(derRechner.modulo(eingabe1, eingabe2));
				break;
			}
			
			System.out.println();

			/*
			 * wir Woll: - Einen Begrüßungstext ausgeben. - Fragen, welche Rechenoperration
			 * ausgeführt werden soll. - Dann die entschprechende Methoden aufrufen - -
			 * Eingaben über den Scanner annehmen. -das ergebnis auf der Konsole ausgeben. -
			 * Fragen ob nochmal gerechnet werden möchte, wenn ja , programm soll nochmal
			 * ausgeführt werden wenn nein , Programm soll beendet werden.
			 */


		}

	}

}
