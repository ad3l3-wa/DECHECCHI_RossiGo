package org.example;
import static java.lang.IO.println;


public class Monopattino extends Veicolo {
    public int velocita;
    public double tariffa;

    public Monopattino(int velocita, double tariffa, String codice, int batteria, boolean stato){
        super(codice,batteria,stato);
        this.velocita = velocita;
        this.tariffa = tariffa;
    }

    public int Velocita(){
        return velocita;
    }

    @Override
    public double calcolaCosto(int minuti){
        tariffa = 0.25*minuti;

        return tariffa;
    }
    @Override
    public double consumoBatteriaPerMinuto(){
        return 0;
    }

}
