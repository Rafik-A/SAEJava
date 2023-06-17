package graphe;

import vue.*;
import java.util.ArrayList;
import java.io.file;

public class Graphe {
    private ArrayList<Arete>() listeAretes;
    private ArrayList<Sommet>() listeSommets;

    public Graphe() {
        ArrayList<Arete>() listeAretes = new ArrayList<Arete>();
        ArrayList<Sommet>() listeSommets = new ArrayList<Sommet>();
    }

    public void ajouterSommet(String nom, TypeSommet type) {
        Sommet s = new Sommet(nom, type);
        listeSommets.add(s);
    }

    public void chargerGraphe(File file) {

    }
}
