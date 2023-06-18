package graphe;

import vue.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.file;

public class Graphe {
    private ArrayList<Arete>() listeAretes;
    private ArrayList<Sommet>() listeSommets;
    public HashMap<String, Arete> hashMapAretes;
    public HashMap<String, Sommet> hashMapSommets;

    public Graphe() {
        ArrayList<Arete>() listeAretes = new ArrayList<Arete>();
        ArrayList<Sommet>() listeSommets = new ArrayList<Sommet>();
        HashMap<String, Arete> hashMapAretes = new HashMap();
        HashMap<String, Sommets> hashMapSommets = new HashMap();
    }

    public void ajouterSommet(String nom, TypeSommet type) {
        Sommet s = new Sommet(nom, type);
        listeSommets.add(s);
    }
}
