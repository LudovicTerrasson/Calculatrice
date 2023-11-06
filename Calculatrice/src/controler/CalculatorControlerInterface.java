package controler;

import javafx.event.ActionEvent;

public interface CalculatorControlerInterface 
{
    // Méthode pour actualiser l'affichage de l'écran
    public void actualiseEcran();

    // Méthode pour actualiser l'accumulateur
    public void actualiseAccu();

    // Méthode pour actualiser l'affichage de la mémoire
    public void actualiseMemoire();
    
    public void handle(ActionEvent event);
}


