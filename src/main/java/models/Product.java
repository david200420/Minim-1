package models;

public class Product {

    private double preu;
    private String nom;
    private String id;
    private int cantitat;


    public Product( int cantita, String name) {

            this.nom = name;//y si lo son pues le pone un valor, asi ahorramos constructores.
            this.cantitat = cantita;
    }

    public String getNom() {
        return this.nom;
    }
    public double getPreu() {
        return preu;
    }

    public int sales() {
        return this.cantitat;
    }
}
