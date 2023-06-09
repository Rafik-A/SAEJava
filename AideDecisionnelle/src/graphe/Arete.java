package graphe;

import vue.*;

public class Arete {
    // attributs
    private Sommet sommet1;
    private Sommet sommet2;
    private String nomArete;   
    private int fiabilite;
    private int distance;
    private int duree;

    // constructeur
    public Arete(Sommet s1, Sommet s2, String nomArete, int fiabilite, int distance, int duree) {
        this.sommet1 = s1;
        this.sommet2 = s2;
        this.nomArete = nomArete;
        this.fiabilite = fiabilite;
        this.distance = distance;
        this.duree = duree;
    }
    
    public Arete(String nomArete, int fiabilite, int distance, int duree) {
        this.nomArete = nomArete;
        this.fiabilite = fiabilite;
        this.distance = distance;
        this.duree = duree;
    }

    // getters et setters
    public Sommet getSommet1() {
        return sommet1;
    }

    public Sommet getSommet2() {
        return sommet2;
    }

    public int getFiabilite() {
        return fiabilite;
    }

    public int getDistance() {
        return distance;
    }

    public int getDuree() {
        return duree;
    }

    public void setSommet1(Sommet s1) {
        this.sommet1 = s1;
    }

    public void setSommet2(Sommet s2) {
        this.sommet2 = s2;
    }

    public void setFiabilite(int fiabilite) {
        this.fiabilite = fiabilite;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "L'arête " + nomArete + " qui relie les sommets " + sommet1 + " et " + sommet2 + " a une fiabilité de " + fiabilite*10 + "%, une distance de " + distance + "km, pour une durée de " + duree + " minutes.";
    }
    // méthodes
    
}