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
        listeAretes = new ArrayList<Arete>();
        listeSommets = new ArrayList<Sommet>();
        hashMapAretes = new HashMap<String, Arete>();
        hashMapSommets = new HashMap<String, Sommet>();
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
    
    public void ajouterArete(Sommet s1, Sommet s2, String nom, int f, int di, int du) {
        Arete a = new Arete(s1, s2, nom, f, di, du);
        listeAretes.add(a);
    }
}
