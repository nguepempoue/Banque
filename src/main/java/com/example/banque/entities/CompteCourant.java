package com.example.banque.entities;

import java.util.Date;

public class CompteCourant extends Compte{
    private double decouvert;

    public CompteCourant() {
        super();
    }

    public CompteCourant(String code, Date dateCreation, double solde, Client client, double decouvert) {
        super(code, dateCreation, solde, client);
        this.decouvert = decouvert;
    }
}
