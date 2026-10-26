package org.example;

public class Bici extends Veicolo{
    public int marce;
    public double tariffa;

    public Bici(int marce, double tariffa, String codice, int batteria, boolean stato){
        super(codice,batteria,stato);
        this.marce = marce;
        this.tariffa = tariffa;
    }
    public int getNumeroMarce(){
        return marce;
    }
    @Override
    public double calcolaCosto(int minuti){
        tariffa = 0.15*minuti;

        return tariffa;
    }
    @Override
    public double consumoBatteriaPerMinuto(){
        return 0;
    }

}
