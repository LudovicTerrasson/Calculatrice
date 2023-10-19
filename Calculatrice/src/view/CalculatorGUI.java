package view;

import java.util.List;

import controler.CalculatorControler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.CalculatorModel;

public class CalculatorGUI extends Application implements CalculatorGUIInterface
{
    public TextField ecran = new TextField();
    public Label memoire = new Label();
    
    public Button B0 = new Button("0");
    public Button B1 = new Button("1");
    public Button B2 = new Button("2");
    public Button B3 = new Button("3");
    public Button B4 = new Button("4");
    public Button B5 = new Button("5");
    public Button B6 = new Button("6");
    public Button B7 = new Button("7");
    public Button B8 = new Button("8");
    public Button B9 = new Button("9");
    public Button Baddition = new Button("+");
    public Button Bsoustraction = new Button("-");
    public Button Bmultiplication = new Button("x");
    public Button Bdivision = new Button("/");
    public Button Bentrée = new Button("push");
    public Button Bpoint = new Button(".");
    public Button Bopposite = new Button("opposite");
    public Button Bpop = new Button("pop");
    public Button Bdrop = new Button("drop");
    public Button Bswap = new Button("swap");
    public Button Bclear = new Button("C");
    public Button Berase = new Button("<=");
    
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
        
        // Etape III : Création d'un ecran pour ma calculatrice
        
        // Réglage (esthétique) de la position de l'écran sur ma calculatrice
        GridPane.setColumnSpan(ecran, 2); // S'étend sur 2 colonnes
        
        // Règlage (esthétique) de la taille de l'écran de ma calculatrice
        ecran.setPrefWidth(180); // Largeur de 180 pixels
        ecran.setPrefHeight(140); // Hauteur de 100 pixels
        
        // Ajout et positionnement de l'écran sur ma calculatrice
        gp.add(ecran,1,1);
        
        
        
        // Etape IV : Création d'une mémoire pour ma calculatrice
        
        
        // Réglage (esthétique) de la position de la mémoire sur ma calculatrice
        GridPane.setColumnSpan(memoire, 2); // S'étend sur 2 colonnes
        
        // Ajout et positionnement de la mémoire sur ma calculatrice
        gp.add(memoire, 4, 1);
 
        
        
        // Etape VI : Création des boutons de ma calculatrice

        
        // Ajout et positionnement des bouttons sur ma calculatrice
        
        gp.add(B0,2,7);
        gp.add(B1,1,6);
        gp.add(B2,2,6);
        gp.add(B3,3,6);
        gp.add(B4,1,5);
        gp.add(B5,2,5);
        gp.add(B6,3,5);
        gp.add(B7,1,4);
        gp.add(B8,2,4);
        gp.add(B9,3,4);
        gp.add(Baddition,4,6);
        gp.add(Bsoustraction,4,5);
        gp.add(Bmultiplication,4,4);
        gp.add(Bdivision,4,3);
        gp.add(Bentrée,4,7);
        gp.add(Bpoint,3,7);
        gp.add(Bopposite,1,7);
        gp.add(Bpop, 3, 2);
        gp.add(Bdrop, 2, 3);
        gp.add(Bswap, 1, 3);
        gp.add(Bclear, 3, 3);
        gp.add(Berase, 3, 1);
        
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
        Bopposite.setPrefHeight(100);
        Bopposite.setPrefWidth(180); // Largeur de 180 pixels
        Bpop.setPrefHeight(70); // Hauteur de 100 pixels
        Bpop.setPrefWidth(100); // Largeur de 180 pixels
        Bdrop.setPrefHeight(100); // Hauteur de 100 pixels
        Bdrop.setPrefWidth(180); // Largeur de 180 pixels
        Bswap.setPrefHeight(100); // Hauteur de 100 pixels
        Bswap.setPrefWidth(180); // Largeur de 180 pixels
        Bclear.setPrefHeight(100); // Hauteur de 100 pixels
        Bclear.setPrefWidth(180); // Largeur de 180 pixels
        Berase.setPrefHeight(70); // Hauteur de 100 pixels
        Berase.setPrefWidth(100); // Largeur de 180 pixels
        
        Bclear.setStyle("-fx-font-size: 20px; -fx-text-fill: #ff0000;");
       
        
    CalculatorModel model = new CalculatorModel();       
    CalculatorControler controler = new CalculatorControler(this, model); // Assurez-vous d'avoir déjà créé votre modèle (model) et déclaré "this" comme votre vue (CalculatorGUI).

        B0.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B1.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B2.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B3.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B4.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B5.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B6.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B7.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B8.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B9.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bpoint.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bentrée.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Baddition.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bsoustraction.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bmultiplication.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bopposite.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e)); 
        Bpop.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e)); 
        Bdrop.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e)); 
        Bswap.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e)); 
        Bclear.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e)); 
        Berase.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        // Etape VIII : Ajout du gestionnaire contenant l'écran et les boutons à ma scène
        Scene sc = new Scene(gp, 800, 800);

        
        
        // Etape IX : Ajout de ma scène à ma calculatrice
        stage.setScene(sc);
        
        
        
        // Etape X : Affichage de ma calculatrice
        stage.show(); 

    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }


	/**
	 * @return the ecran
	 */
    @Override
	public String LireEcran() {
		return this.ecran.getText();
	}


	/**
     * @param string
	 */
    @Override
	public void setEcran(String string) {
		this.ecran.setText(string);
	}


	/**
	 * @return the memoire
	 */
    @Override
	public Label getMemoire() {
		return memoire;
	}


	/**
     * @param stackData
	 */
    @Override
	public void setMemoire(List<Double> stackData) {
		this.memoire.setText(String.valueOf(stackData));
		
	}
}
    
  

  