package com.example.banque.entities;

import java.util.Date;

public class Retrait extends Operation{
    public Retrait() {
        super();
    }

    public Retrait(Date dateOperation, double montant, Compte compte) {
        super(dateOperation, montant, compte);
    }
}
