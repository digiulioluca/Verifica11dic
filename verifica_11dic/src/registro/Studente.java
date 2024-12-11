package registro;

public class Studente {
	/* attributi protetti = potranno essere utilizzati solo da sub-class
	 o in altri punti dello stesso package*/
	protected String nome;
	protected String cognome;
	protected int matricola;
	
	public Studente (String nome, String cognome, int matricola) {
		// metodo Costruttore dove con this vado ad inizializzare gli attributi
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	public void descrizione() {
		/* metodo che stampa gli attributi dello studente. 
		 * Questo metodo verrà richiamato nella classe Registro per i metodi
		 * che ci permetteranno di stampare la lista e effettuare la ricerca.*/
		System.out.println("Nome: "+nome+", Cognome: "+cognome+", Matricola: "+matricola);
	}
}
