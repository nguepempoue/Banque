package com.example.banque.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public abstract class Compte implements Serializable {
    private String code;
    private Date dateCreation;
    private double solde;
    private Client client;
    private Collection<Operation> operations;

    public Compte() {
        super();
    }

    public Compte(String code, Date dateCreation, double solde, Client client) {
        this.code = code;
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.client = client;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Collection<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }
}
