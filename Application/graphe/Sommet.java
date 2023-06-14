package graphe;

import vue.*;

public class Sommet {
    private ArrayList<Sommet>() listeSommetsAdjacents;
    private int fiabilite;
    private int distance;
    private int duree;


    public Sommet(int fiabilite, int distance, int duree) {
        this.fiabilite = fiabilite;
        this.distance = distance;
        this.duree = duree;
    }

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