
package view;

import controler.CalculatorControler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CalculatorGUI extends Application implements CalculatorGUIInterface
{
    public TextField ecran = new TextField();
    public Label memoire = new Label();
    
    Button B0 = new Button("0");
    Button B1 = new Button("1");
    Button B2 = new Button("2");
    Button B3 = new Button("3");
    Button B4 = new Button("4");
    Button B5 = new Button("5");
    Button B6 = new Button("6");
    Button B7 = new Button("7");
    Button B8 = new Button("8");
    Button B9 = new Button("9");
    Button Baddition = new Button("+");
    Button Bsoustraction = new Button("-");
    Button Bmultiplication = new Button("x");
    Button Bdivision = new Button("/");
    Button Bentrée = new Button("Entrée");
    Button Bpoint = new Button(".");

    
    @Override
    public void start(Stage stage)
    {
        // Etape I : Affectation d'un nom pour ma calculatrice
        stage.setTitle("Luna Calculette");
        
        
        
        // Etape II : Création d'un gestionnaire pour organiser et placer les éléments de ma calculatrice
        GridPane gp = new GridPane();
        
        // Réglage (esthétique) de l'écart entre les éléments de ma calculatrice
        gp.setHgap(10);
        gp.setVgap(10);
        
        
        // Etape III : Création d'un écran pour ma calculatrice
        setÉcran(new TextField());
        
        // Réglage (esthétique) de la position de l'écran sur ma calculatrice
        GridPane.setColumnSpan(getÉcran(), 2); // S'étend sur 2 colonnes
        
        // Règlage (esthétique) de la taille de l'écran de ma calculatrice
        getÉcran().setPrefWidth(180); // Largeur de 180 pixels
        getÉcran().setPrefHeight(100); // Hauteur de 100 pixels
        
        // Ajout et positionnement de l'écran sur ma calculatrice
        gp.add(getÉcran(),1,1);
        
        
        
        // Etape IV : Création d'une mémoire pour ma calculatrice
        Label memoire = new Label();
        
        // Réglage (esthétique) de la position de la mémoire sur ma calculatrice
        GridPane.setColumnSpan(memoire, 2); // S'étend sur 2 colonnes
        
        // Ajout et positionnement de la mémoire sur ma calculatrice
        gp.add(memoire, 3, 1);
 
        
        
        // Etape VI : Création des boutons de ma calculatrice

        
        // Ajout et positionnement des bouttons sur ma calculatrice
        
        gp.add(B0,1,2);
        gp.add(B1,2,2);
        gp.add(B2,3,2);
        gp.add(B3,4,2);
        gp.add(B4,1,3);
        gp.add(B5,2,3);
        gp.add(B6,3,3);
        gp.add(B7,4,3);
        gp.add(B8,1,4);
        gp.add(B9,2,4);
        gp.add(Baddition,1,5);
        gp.add(Bsoustraction,2,5);
        gp.add(Bmultiplication,3,5);
        gp.add(Bdivision,4,5);
        gp.add(Bentrée,3,4);
        gp.add(Bpoint,4,4);
        
        // Règlage (esthétique) de la taille des boutons de ma calculatrice
        B0.setPrefWidth(180); // Largeur de 180 pixels
        B0.setPrefHeight(100); // Hauteur de 100 pixels
        B1.setPrefWidth(180); // Largeur de 180 pixels
        B1.setPrefHeight(100); // Hauteur de 100 pixels
        B2.setPrefWidth(180); // Largeur de 180 pixels
        B2.setPrefHeight(100); // Hauteur de 100 pixels
        B3.setPrefWidth(180); // Largeur de 180 pixels
        B3.setPrefHeight(100); // Hauteur de 100 pixels
        B4.setPrefWidth(180); // Largeur de 180 pixels
        B4.setPrefHeight(100); // Hauteur de 100 pixels
        B5.setPrefWidth(180); // Largeur de 180 pixels
        B5.setPrefHeight(100); // Hauteur de 100 pixels
        B6.setPrefWidth(180); // Largeur de 180 pixels
        B6.setPrefHeight(100); // Hauteur de 100 pixels
        B7.setPrefWidth(180); // Largeur de 180 pixels
        B7.setPrefHeight(100); // Hauteur de 100 pixels
        B8.setPrefWidth(180); // Largeur de 180 pixels
        B8.setPrefHeight(100); // Hauteur de 100 pixels
        B9.setPrefWidth(180); // Largeur de 180 pixels
        B9.setPrefHeight(100); // Hauteur de 100 pixels
        Bpoint.setPrefWidth(180); // Largeur de 180 pixels
        Bpoint.setPrefHeight(100); // Hauteur de 100 pixels
        Bentrée.setPrefWidth(180); // Largeur de 180 pixels
        Bentrée.setPrefHeight(100); // Hauteur de 100 pixels
        Baddition.setPrefWidth(180); // Largeur de 180 pixels
        Baddition.setPrefHeight(100); // Hauteur de 100 pixels
        Bsoustraction.setPrefWidth(180); // Largeur de 180 pixels
        Bsoustraction.setPrefHeight(100); // Hauteur de 100 pixels
        Bmultiplication.setPrefWidth(180); // Largeur de 180 pixels
        Bmultiplication.setPrefHeight(100); // Hauteur de 100 pixels
        Bdivision.setPrefWidth(180); // Largeur de 180 pixels
        Bdivision.setPrefHeight(100); // Hauteur de 100 pixels
        

        B0.addEventHandler(ActionEvent.ACTION, new CalculatorControler());

    }

    /**
     * @return the écran
     */
    public TextField getÉcran()
    {
        return écran;
    }

    /**
     * @param écran the écran to set
     */
    public void setÉcran(TextField écran)
    {
        this.écran = écran;
    }
    
   


}