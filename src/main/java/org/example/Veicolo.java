package org.example;

public abstract class Veicolo {
    public String codice;
    public int batteria;
    public boolean stato;

    public Veicolo(String codice, int batteria, boolean stato){
        this.codice = codice;
        this.batteria = batteria;
        this.stato = stato;
    }

    public abstract double calcolaCosto(int minuti);
    public abstract double consumoBatteriaPerMinuto();
}
