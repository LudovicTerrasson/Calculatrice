package controler;

import model.CalculatorModel;
import view.CalculatorGUI;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class CalculatorControler implements EventHandler<ActionEvent>, CalculatorControlerInterface 
{
    // Les contrôleurs sont responsables de la gestion des événements utilisateur
    // Cette classe est un contrôleur qui réagit aux actions de l'utilisateur sur les boutons.

    public CalculatorGUI gui; // Référence à la vue (l'interface utilisateur)
    public CalculatorModel model; // Référence au modèle (la logique de la calculatrice)

    // Constructeur de la classe CalculatorControler
    public CalculatorControler(CalculatorGUI gui, CalculatorModel model) 
    {
        this.gui = gui; // Initialise la référence à la vue
        this.model = model; // Initialise la référence au modèle
    }

    @Override
    public void handle(ActionEvent event) 
    {
        // La méthode handle est appelée chaque fois qu'un événement (clic de bouton) se produit

        Object boutton = event.getSource(); // Récupère l'objet (bouton) qui a déclenché l'événement
        Button b = (Button) boutton; // Convertit l'objet en bouton
        String texte = b.getText(); // Récupère le texte affiché sur le bouton
        String lu = gui.LireEcran(); // Lit le texte actuellement affiché sur l'écran

        // En fonction du texte du bouton cliqué, nous effectuons différentes actions
        
        // Si l'utilisateur vient de faire une erreur 
        if(lu.startsWith("Erreur"))
        {
            gui.setEcran(texte); // Suppression du message d'erreur et ajout du chiffre a l'écran
            actualiseAccu(); // Met a jour l'accumulateur 
        }
        // Si l'utilisateur a cliqué sur le bouton push, nous appelons la méthode push du modèle
        else if(texte.equals("push"))
        {
            model.push(); // Appelle la méthode push du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran();  // Met à jour l'affichage de l'écran    
        }
        // Si l'utilisateur a cliqué sur le bouton d'addition, nous appelons la méthode add du modèle
        else if (texte.equals("+")) 
        {
            model.add(); // Appelle la méthode add du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton de soustraction, nous appelons la méthode substract du modèle
        else if(texte.equals("-"))
        {
            model.substract(); // Appelle la méthode substract du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton de multiplication, nous appelons la méthode multiply du modèle
        else if(texte.equals("x"))
        {
            model.multiply(); // Appelle la méthode multiply du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton de division, nous appelons la méthode divide du modèle
        else if(texte.equals("/"))
        {
            model.divide(); // Appelle la méthode divide du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton swap, nous appelons la méthode swap du modèle
        else if(texte.equals("swap"))
        {
            model.swap(); // Appelle la méthode swap du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton C, nous appelons la méthode clear du modèle
        else if(texte.equals("C"))
        {
            model.clear(); // Appelle la méthode clear du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton opposite, nous appelons la méthode opposite du modèle
        else if(texte.equals("opposite"))
        {
            model.opposite(); // Appelle la méthode opposite du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton drop, nous appelons la méthode drop du modèle
        else if(texte.equals("drop"))
        {
            model.drop(); // Appelle la méthode drop du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton pop, nous appelons la méthode pop du modèle
        else if(texte.equals("pop"))
        {
            model.pop(); // Appelle la méthode pop du modèle
            actualiseMemoire(); // Met à jour l'affichage de la mémoire
            actualiseEcran(); // Met à jour l'affichage de l'écran
        }
        // Si l'utilisateur a cliqué sur le bouton pour effacer, nous appelons la méthode erase du modèle
        else if(texte.equals("<="))
         {
             model.erase(); // Appelle la méthode erase du modèle
             actualiseMemoire(); // Met à jour l'affichage de la mémoire
             actualiseEcran(); // Met à jour l'affichage de l'écran
         }
        // Sinon alors l'utilisateur a cliqué sur le bouton d'un chiffre ou du point, donc nous l'affichons sur l'écran
        else
        {
            // Ajout du chiffre a l'écran
            gui.setEcran(lu+texte); //Met a jour l'écran en rajoutant le nouveau chiffre ou point
            actualiseAccu(); // Met a jour l'accumulateur 
        }   
    }
    
    @Override
    public void actualiseEcran() 
    {
        // Cette méthode met à jour l'affichage de l'écran avec la valeur de l'accumulateur du modèle
        gui.setEcran(model.accu); // Met à jour l'affichage de l'écran avec la valeur de l'accumulateur
    }

    @Override
    public void actualiseAccu() 
    {
        // Cette méthode met à jour la valeur de l'accumulateur du modèle en lisant le texte de l'écran
        model.accu = gui.LireEcran(); // Met à jour la valeur de l'accumulateur en lisant le texte de l'écran
    }

    @Override
    public void actualiseMemoire() 
    {
        // Cette méthode met à jour l'affichage de la mémoire avec la pile du modèle
        gui.setMemoire(model.pile); // Met à jour l'affichage de la mémoire avec la pile du modèle
    }
}
