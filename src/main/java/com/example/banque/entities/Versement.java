package com.example.banque.entities;

import java.util.Date;

public class Versement extends  Operation{

    public Versement() {
        super();
    }

    public Versement(Date dateOperation, double montant, Compte compte) {
        super(dateOperation, montant, compte);
    }
}
