package controler;

import model.CalculatorModel;
import view.CalculatorGUI;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class CalculatorControler implements EventHandler<ActionEvent>, CalculatorControlerInterface {
    // Les contrôleurs sont responsables de la gestion des événements utilisateur
    // Cette classe est un contrôleur qui réagit aux actions de l'utilisateur sur les boutons.

    public CalculatorGUI gui; // Référence à la vue (l'interface utilisateur)
    public CalculatorModel model; // Référence au modèle (la logique de la calculatrice)

    // Constructeur de la classe CalculatorControler
    public CalculatorControler(CalculatorGUI gui, CalculatorModel model) {
        this.gui = gui; // Initialise la référence à la vue
        this.model = model; // Initialise la référence au modèle
    }

    @Override
    public void handle(ActionEvent event) {
        // La méthode handle est appelée chaque fois qu'un événement (clic de bouton) se produit

        Object boutton = event.getSource(); // Récupère l'objet (bouton) qui a déclenché l'événement
        Button b = (Button) boutton; // Convertit l'objet en bouton
        String texte = b.getText(); // Récupère le texte affiché sur le bouton
        String lu = gui.LireEcran(); // Lit le texte actuellement affiché sur l'écran

        // En fonction du texte du bouton cliqué, nous effectuons différentes actions
        if (texte.equals("push")) {
            if (!lu.isEmpty()) {
                // Si l'écran n'est pas vide, nous essayons de pousser le nombre actuellement affiché
                model.push(Double.valueOf(lu)); // Appelle la méthode push du modèle
                actualiseMemoire(); // Met à jour l'affichage de la mémoire
                actualiseEcran(); // Met à jour l'affichage de l'écran
            } else {
                // Si l'écran est vide, nous affichons un message d'erreur à l'utilisateur
                gui.setEcran("Veuillez sélectionner un nombre avant de push");
            }
        } else if (texte.equals("+")) {
            // Si l'utilisateur a cliqué sur le bouton d'addition, nous appelons la méthode add du modèle
            model.add(); // Appelle la méthode add du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        else if(texte.equals("-"))
        {
            model.substract();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("x"))
        {
            model.multiply();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("/"))
        {
            model.divide();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("swap"))
        {
            model.swap();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("C"))
        {
            model.clear();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("opposite"))
        {
            model.opposite();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("clear"))
        {
            model.clear();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("drop"))
        {
            model.drop();
            actualiseMemoire();
            actualiseEcran();
        }
         else if(texte.equals("pop"))
        {
            model.pop();
            actualiseMemoire();
            actualiseEcran();
        }
         else if(texte.equals("<="))
         {
             model.erase();
             actualiseMemoire();
             actualiseEcran();
         }
        // Si l'utilisateur vient de faire une erreur 
        else if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            gui.setEcran(texte); 
            actualiseAccu();
        }
         else if("Veuillez sélectionner un nombre avant de push".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            gui.setEcran(texte); 
            actualiseAccu();
        }
           else if("Veuillez selectionner deux opérandes avant de swap".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            gui.setEcran(texte); 
            actualiseAccu();
        }
           else if("L'accumulateur est déja vide".equals(lu))
           {
               // Suppression du message d'erreur et ajout du chiffre a l'écran
               gui.setEcran(texte); 
               actualiseAccu();
           }
           else if("Veuillez sélectionner un nombre pour en obtenir l'opposé".equals(lu))
           {
               // Suppression du message d'erreur et ajout du chiffre a l'écran
               gui.setEcran(texte); 
               actualiseAccu();
           }
           else if("La pile est vide".equals(lu))
           {
               // Suppression du message d'erreur et ajout du chiffre a l'écran
               gui.setEcran(texte); 
               actualiseAccu();
           }
        else
        {
            // Ajout du chiffre a l'écran
            gui.setEcran(lu+texte);
            actualiseAccu();
            actualiseEcran();

        }
        
    }
    
    @Override
    public void actualiseEcran() {
        // Cette méthode met à jour l'affichage de l'écran avec la valeur de l'accumulateur du modèle
        gui.setEcran(model.accu); // Met à jour l'affichage de l'écran avec la valeur de l'accumulateur
    }

    @Override
    public void actualiseAccu() {
        // Cette méthode met à jour la valeur de l'accumulateur du modèle en lisant le texte de l'écran
        model.accu = gui.LireEcran(); // Met à jour la valeur de l'accumulateur en lisant le texte de l'écran
    }

    @Override
    public void actualiseMemoire() {
        // Cette méthode met à jour l'affichage de la mémoire avec la pile du modèle
        gui.setMemoire(model.pile); // Met à jour l'affichage de la mémoire avec la pile du modèle
    }
}
