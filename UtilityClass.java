import java.util.Scanner;

public class UtilityClass {

   public static void main(String[] args) {

    // Oggetto per conto bancario

    Scanner scanner = new Scanner(System.in);

    // Creazione di un oggetto ContoBancario con numero di conto
    ContoBancario conto = new ContoBancario("123456789", 100.00d);

    System.out.println("Benvenuto nel sistema di Zimo's Bank!");
    System.out.println("Scegli un'operazione: Digita 'deposito' per depositare o 'prelievo' per prelevare.");

    String scelta = scanner.nextLine().toLowerCase(); 
//
    if (scelta.equals("deposito")) {
        System.out.println("Inserisci l'importo da depositare:");
        double deposito = scanner.nextDouble();
        conto.depositoDenaro(deposito);
    } else if (scelta.equals("prelievo")) {
        System.out.println("Inserisci l'importo da prelevare:");
        double prelievo = scanner.nextDouble();
        conto.ritiroDenaro(prelievo);
    } else {
        System.out.println("Operazione non riconosciuta. Riprova.");
    }
    scanner.close();
   }

}