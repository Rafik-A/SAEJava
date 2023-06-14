package graphe;

import vue.*;

public class Sommet {
    // attributs
    private ArrayList<Sommet>() listeSommetsAdjacents;
    private String nomSommet;
    private TypeSommet typeSommet;

    // constructeur
    public Sommet(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    // getters et setters
    public ArrayList<Sommet>() getListeSommetsAdjacents() {
        return listeSommetsAdjacents;
    }

    public String getNomSommet() {
        return nomSommet;
    }

    public String getTypeSommet() {
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
        for(Arete a : g.getlisteArete) {
            if(this == a.getSommet1) {
                listeSommetsAdjacents.add(a.getSommet2);
            } else if(this == a.getSommet2) {
                listeSommetsAdjacents.add(a.getSommet1);
            }
        }
    }
}