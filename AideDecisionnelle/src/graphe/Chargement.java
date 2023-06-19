package graphe;

import java.io.BufferedReader;
import vue.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Chargement {
    public Graphe g = new Graphe();
    
    public void ouverture() {
        try {
            JFileChooser dossier = new JFileChooser();
            
            dossier.setCurrentDirectory(new File("." + File.separator));
            FileNameExtensionFilter typeFichier = new FileNameExtensionFilter("csv");
            dossier.setFileFilter(typeFichier);
            
            int reponse = dossier.showDialog(dossier, "Ouvrir");
            
            if(reponse == JFileChooser.APPROVE_OPTION) {
                String fichier = dossier.getSelectedFile().toString();
                try(BufferedReader br = new BufferedReader(new FileReader(fichier))) {
                    String ligne;
                    
                    while((ligne = br.readLine()) != null) {
                        if(ligne.startsWith("/")) {
                            continue;
                        } else if(ligne.startsWith("S")) {
                            
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