package graphe;

import vue.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;

public class Graphe {
    private ArrayList<Arete> listeAretes;
    private ArrayList<Sommet> listeSommets;
    public HashMap<String, Arete> hashMapAretes;
    public HashMap<String, Sommet> hashMapSommets;

    public Graphe() {
        ArrayList<Arete> listeAretes = new ArrayList<Arete>();
        ArrayList<Sommet> listeSommets = new ArrayList<Sommet>();
        HashMap<String, Arete> hashMapAretes = new HashMap<String, Arete>();
        HashMap<String, Sommet> hashMapSommets = new HashMap<String, Sommet>();
    }

    public ArrayList<Arete> getListeAretes() {
        return listeAretes;
    }

    public ArrayList<Sommet> getListeSommets() {
        return listeSommets;
    }

    public void ajouterSommet(String nom, TypeSommet type) {
        Sommet s = new Sommet(nom, type);
        listeSommets.add(s);
    }
}
