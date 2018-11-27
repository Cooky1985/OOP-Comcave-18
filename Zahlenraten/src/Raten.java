import java.util.Scanner;
 
public class Raten {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int random = (int) (1 + Math.random() * 100);
        int count = 0;
 
        System.out.println("Bitte erraten Sie die gesuchte Zahl, "
                + "sie befindet sich zwischen 1 und 100.");
 
        int tipp = 0;
        while (tipp != random) {
            count++;
            System.out.print("Ihr " + count + ". Versuch: ");
            tipp = scanner.nextInt();
 
            if (tipp == random) {
                System.out.println("Glueckwunsch die von Ihnen eingegebene Zahl"
                        + " (" + tipp + ") "
                        + "stimmt mit der gesuchten Zahl ueberein.");
            } else if (tipp < random) {
                System.out.println("Die gesuchte Zahl ist groesser.");
            } else if (tipp > random) {
                System.out.println("Die gesuchte Zahl ist kleiner.");
            }
        }
        scanner.close();
    }
 
}