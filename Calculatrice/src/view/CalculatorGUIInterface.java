package view;

import java.util.List;
import javafx.scene.control.Label;

public interface CalculatorGUIInterface {
    // Méthode pour lire le contenu de l'écran de la calculatrice
    public String LireEcran();

    // Méthode pour définir le contenu de l'écran de la calculatrice
    public void setEcran(String string);

    // Méthode pour obtenir l'étiquette d'affichage de la mémoire
    public Label getMemoire();

    // Méthode pour mettre à jour l'affichage de la mémoire
    public void setMemoire(List<Double> stackData);
}
