import java.util.Scanner;

public class UtilityClass {

   public static void main(String[] args) {

    // Oggetto per conto bancario

    Scanner scanner = new Scanner(System.in);

    // Creazione di un oggetto ContoBancario con numero di conto
    ContoBancario conto = new ContoBancario("123456789", 100.00d);

    System.out.println("Benvenuto nel sistema bancario! Cosa vuoi fare?");
    

    scanner.close();
   }

}