package graphe;

import vue.*;
import java.util.ArrayList;

public class Sommet {
    // attributs
    private ArrayList<Sommet> listeSommetsAdjacents;
    private String nomSommet;
    private TypeSommet typeSommet;

    // constructeur
    public Sommet(String nom, TypeSommet type) {
        this.nomSommet = nom;
        this.typeSommet = type;
    }

    // getters et setters
    public ArrayList<Sommet> getListeSommetsAdjacents() {
        return listeSommetsAdjacents;
    }

    public String getNomSommet() {
        return nomSommet;
    }

    public TypeSommet getTypeSommet() {
        return typeSommet;
    }

    public void setNomSommet(String nom) {
        this.nomSommet = nom;
    }

    public void setTypeSommet(TypeSommet type) {
        this.typeSommet = type;
    }

    // méthodes
    public void initialiserSommetAdjacent(Graphe g) {
        for(Arete a : g.getListeAretes()) {
            if(this == a.getSommet1()) {
                listeSommetsAdjacents.add(a.getSommet2());
            } else if(this == a.getSommet2()) {
                listeSommetsAdjacents.add(a.getSommet1());
            }
        }
    }
}