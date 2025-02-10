/* 
*Snack 2: Gestione di un Conto*
Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente. */

public class ContoBancario {
    private String codiceBancario;
    private double importoConto;

// costruttore
public ContoBancario (String codiceBancrio, double importoConto){

    this.codiceBancario = codiceBancrio;
    this.importoConto = 00.00;
}
// get codice conto
public String getCodiceConto(){

    return codiceBancario;
    
}
// set codice conto
public void setCodiceConto(String codiceBancario){

    this.codiceBancario = codiceBancario;
}

// get importo conto
public double getImportoConto(){

    return  importoConto;

}

//set importo conto 
public void getImportoConto(double importoConto){

    this.importoConto = importoConto;

}
//metodo metodo per aggiungere
public void depositoDenaro (double depositoTotale){

    if (importoConto >= 0) {
        this.importoConto += depositoTotale;
        System.out.println("Stai depositando il seguente improto" + depositoTotale + "saldo attuale di" + importoConto);
    } else {
        System.out.println("l'importo totale deve essere superiore");
    }

}
//metodo per ritirare
public void ritiroDenaro (double ritiroTotale){

    if (ritiroTotale > 0 && ritiroTotale <= importoConto){

        this.importoConto -= ritiroTotale;
        System.out.println("Stai prelevando la seguente cifra " + ritiroTotale + " il tuo saldo disponibile è " + importoConto );
       
    } else if (importoConto > ritiroTotale){
        System.out.println("Non puoi ritirare importo non sufficente");

    } else {
        System.out.println("l'importo del prelievo deve essere positivo");
    }

}

public void selezionaOpzione(int opzione){
        
    switch(opzione) {
        case 1:
        System.out.println("Hai selezionato l'opzione 1");
        break;
          
        case 2:
        System.out.println("Hai selezionato l'opzione 2");
        break;
        
        default:
        System.out.println("grazie e arrivederci");
        break;
      }

}

}
