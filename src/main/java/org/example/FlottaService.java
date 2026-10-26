package org.example;

public class FlottaService {
    public Veicolo gestione;
    public Utente utente;
    public Noleggio noleggio;

    public FlottaService(Veicolo gestione, Utente utente, Noleggio noleggio){
        this.gestione = gestione;
        this.utente = utente;
        this.noleggio = noleggio;
    }


}
