package org.example;

public class Noleggio {
    public Utente utente;
    public Veicolo veicolo;
    public String ora_inizio;
    public String ora_fine;

    public Noleggio(Utente utente, Veicolo veicolo, String ora_inizio, String ora_fine){
        this.utente = utente;
        this.veicolo = veicolo;
        this.ora_inizio = ora_inizio;
        this.ora_fine = ora_fine;
    }

}
