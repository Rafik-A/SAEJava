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
                    while((ligne = br.readLine()) != null) {
                        String lignes[] = ligne.split("\n");
                        if(ligne.startsWith("/")) {
                            continue;
                        } else {
                            String[] infos = ligne.split(";");
                            g.ajouterSommet(infos[0], TypeSommet.valueOf(infos[1]));
                            for(int i = 2; i < lignes.length; i++) {
                                System.out.println("test1");
                                if(infos[i].equals("0")) {
                                    System.out.println("test2");
                                    continue;
                                } else {
                                    String[] infoSup = infos[i].split(","); 
                                    g.ajouterArete("a" + (i-1), Integer.parseInt(infoSup[0].trim()), Integer.parseInt(infoSup[1].trim()), Integer.parseInt(infoSup[2].trim()));
                                    System.out.println(g.getListeAretes().get(i-2));
                                    
                                }
                                
                            }
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