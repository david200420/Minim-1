package models;

import java.util.List;

public class User {

    private int id;
    private String nom;

    public User(int id, String nom)  {
        this.id =id;
        this.nom =nom;
    }
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

}
