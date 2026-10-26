package org.example;

public class Utente {
    public int id;
    public String nome;
    public String CodFiscale;
    public double credito;

    public Utente(int id, String nome, String CodFiscale, double credito){
        this.id = id;
        this.nome = nome;
        this.CodFiscale = CodFiscale;
        this.credito = credito;
    }
}
