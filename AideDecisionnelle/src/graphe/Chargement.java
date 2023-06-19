package graphe;

import java.io.BufferedReader;
import vue.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Chargement {
    public static Graphe g = new Graphe();
    
    
    public static void ouverture() {
        try {
            JFileChooser dossier = new JFileChooser();
            
            dossier.setCurrentDirectory(new File("." + File.separator));
            FileNameExtensionFilter typeFichier = new FileNameExtensionFilter("Fichiers de type csv","csv");
            dossier.setFileFilter(typeFichier);
            
            int reponse = dossier.showDialog(dossier, "Ouvrir");
            
            if(reponse == JFileChooser.APPROVE_OPTION) {
                String fichier = dossier.getSelectedFile().toString();
                try(BufferedReader br = new BufferedReader(new FileReader(fichier))) {
                    String ligne;
                    String lignes[] = fichier.split("\n");
                    
                    while((ligne = br.readLine()) != null) {
                        if(ligne.startsWith("/")) {
                            continue;
                        } else {
                            String infoArete;
                            String[] infos = ligne.split(";");
                            g.ajouterSommet(infos[0], TypeSommet.valueOf(infos[1]));
                            
                            for(int i = 2; i < lignes.length; i++) {
                                
                            }
                            //System.out.println(s.toString());
                            //System.out.println(ligne);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
}