package vue;

//import graphe.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface extends JFrame {

    public Interface() {
        initComponents();
    }

    public static void main(String args[]) {
        // Création de la JFrame
        Interface interfaceApp = new Interface();
        
        // Affichage de la JFrame
        interfaceApp.setVisible(true);
    }

    public void initComponents() {
        // Initialisation des composants

        // Configuration du layout et des composants

        // Ajout des composants

        // Configuration de la JFrame
        this.setSize(1000, 700);
        this.setTitle("Logiciel d'aide à la décision");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
}