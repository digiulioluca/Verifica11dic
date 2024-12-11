/*
Gestione di un Registro di Studenti
Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:

Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma
 */

package registro;

// import scanner
import java.util.Scanner;

public class Main {
	
	// metodo menu
	static void menu(Scanner scanner, Registro reg1) {
		// variabile per gestire il do-while e switch case
		int scelta = 1;
		// variabili per poter istanziare l'oggetto Studente e gestire gli input
		String nome = " ";
		String cognome = " ";
		int matricola = 0;
		
		do {
			/* ciclo do-while e switch case:
			 finché il numero inserito non sarà 4 (caso dove abbiamo previsto l'uscita), il programmma
			 indirizzerà l'utente verso una delle funzionalità del registro o restituirà un messaggio 
			 d'errore (previsto nel caso 'default')*/
			
			System.out.println("Menù registro studenti: \n"
					+"1) Aggiungi uno studente\n2) Visualizza l'elenco completo\n"
					+"3) Cerca uno studente per matricola\n4) Esci");
			scelta = scanner.nextInt();
			switch (scelta) {
			case 1:	// aggiunta studente
				scanner.nextLine();	// nextLine per evitare un conflitto col precedente nextInt
				
				// oggetto studente da passare come argomento del metodo "aggiungi"
				Studente stud = new Studente(nome, cognome, matricola);
				
				// inserimento valori
				System.out.println("Inserisci nome:");
				stud.nome = scanner.nextLine();
				System.out.println("Inserisci cognome:");
				stud.cognome = scanner.nextLine();
				System.out.println("Inserisci matricola (a 4 cifre):");
				stud.matricola = scanner.nextInt();
				
				// richiamo il metodo aggiungi
				reg1.aggiungi(stud);
				break;
			case 2:	// stampa elenco
				reg1.stampaLista();
				break;
			case 3:	// ricerca studente via matricola
				System.out.println("Inserisci un numero di matricola (4 cifre) per effettuare una ricerca:");
				matricola = scanner.nextInt();
				reg1.ricercaViaMatricola(matricola);
				break;
			case 4:	// uscita dal programma
				System.out.println("Stai uscendo dal programma.");
				break;
			default:
				System.out.println("Codice errato. Ritorno al menù principale.\n");
			}
		} while (scelta != 4);
	}

	public static void main(String[] args) {
		/* DICHIARAZIONE VARIABILI:
		 i due argomenti che passeremo al menù (oggetti Registro e scanner) */
		Registro reg1 = new Registro();
		Scanner scanner = new Scanner(System.in);
		
		//richiamo il menù
		menu(scanner, reg1);
		
		// chiusura scanner
		scanner.close();
		
		/* System.exit che verrà azionato quando nel menù verrà 
		 premuto il tasto '4' (uscita dal programma)*/
		System.exit(0);

	}

}
