package registro;

// import della classe ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
	/* attributi di questa classe: - un ArrayList di tipo Studente, che conterrà
	 tutti i campi della classe Studente e verrà utilizzato per memorizzare tutti
	 gli studenti che verranno aggiunti. */
	ArrayList<Studente> elenco = new ArrayList<Studente>();

	public void aggiungi(Studente studente, Scanner scanner) {
		// aggiungo l'oggetto che nel menù verrà passato come argomento all'ArrayList
		
		/* AGGIUNTA successiva (ore 11:19). 
		   Controllo sulla matricola. Se, scorrendo l'ArrayList, trovo un numero uguale a quello inserito
		   inizialmente da tastiera, chiedo il re-inserimento del numero di matricola tramite lo scanner.*/
		for (Studente add: elenco) {
			if (studente.matricola==add.matricola) {
				System.out.println("Matricola già inserita. Reinserire matricola (sempre a 4 cifre:) ");
				studente.matricola = scanner.nextInt();
				}
		}
		elenco.add(studente);
		
		// stampa per mandare a capo prima di ritornare al menù
		System.out.println("");
	}

	public void stampaLista() {
		/* metodo che si occupare di stampare l'ArrayList:
		 prima di procedere alla stampa tramite for-each(e richiamando il metodo descrizione della classe
		 Studente), effettuo un controllo sull'ArrayList, per verificare che non sia vuoto.*/
		if (elenco.isEmpty()) {
			System.out.println("Al momento nessuno studente è stato registrato presso il nostro istituto.\n");
		} else {
			System.out.println("Elenco studenti: ");
			for (Studente stampa : elenco) {
				stampa.descrizione();
			}
		}
		
		System.out.println("");
	}

	public void ricercaViaMatricola(int matricola) {
		/* metodo ricerca:
		 utilizzo una variabile booleana per gestire la ricerca tramite for-each nell'ArrayList.
		 Se, a fine ricerca, il valore resterà false, stampare un testo di errore. Nel for-each
		 effettuo un controllo per ogni valore che assumerà 'ricerca' esclusivamente sul numero di matricola.
		 Quando lo studente verrà trovato, cambierà il valore della variabile booleana e verranno stampati
		 i dati dello studente ricercato.*/
		boolean trovato = false;

		for (Studente ricerca : elenco) {
			if (matricola == ricerca.matricola) {
				System.out.println("Studente trovato. Dati completi: ");
				ricerca.descrizione();
				trovato = true;
			}
		}
		if (trovato == false)
			System.out.println("Matricola errata o studente" + " non registrato presso il nostro istituto.");
		
		System.out.println("");
	}

}
