package view;

import java.util.List;

import controler.CalculatorControler;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.CalculatorModel;

public class CalculatorGUI extends Application implements CalculatorGUIInterface {
    // La classe CalculatorGUI gère l'interface utilisateur de la calculatrice.

    public TextField ecran = new TextField(); // Champ de texte pour l'écran de la calculatrice
    public Label memoire = new Label(); // Étiquette pour afficher la mémoire (pile)

    // Boutons de la calculatrice
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
    public void start(Stage stage) {
        // Configuration de l'interface utilisateur de la calculatrice

        stage.setTitle("Luna Calculette"); // Titre de la fenêtre

        GridPane gp = new GridPane(); // Crée un gestionnaire de mise en page (grille)

        gp.setHgap(10); // Espacement horizontal entre les éléments de la grille
        gp.setVgap(10); // Espacement vertical entre les éléments de la grille

        GridPane.setColumnSpan(ecran, 2); // L'écran s'étend sur 2 colonnes
        GridPane.setRowSpan(ecran, 2); // L'écran s'étend sur 2 lignes

        ecran.setPrefHeight(150); // Hauteur de l'écran

        gp.add(ecran, 1, 1); // Ajoute l'écran à la grille

        GridPane.setColumnSpan(memoire, 1); // La mémoire s'étend sur 1 colonne
        gp.add(memoire, 4, 1); // Ajoute l'affichage de la mémoire à la grille

        // Ajoute et positionne les boutons sur la grille
        // (Notez que la taille des boutons est définie ci-dessous pour tous les boutons de manière similaire)

        gp.add(B0, 2, 7);
        gp.add(B1, 1, 6);
        gp.add(B2, 2, 6);
        gp.add(B3, 3, 6);
        gp.add(B4, 1, 5);
        gp.add(B5, 2, 5);
        gp.add(B6, 3, 5);
        gp.add(B7, 1, 4);
        gp.add(B8, 2, 4);
        gp.add(B9, 3, 4);
        gp.add(Baddition, 4, 6);
        gp.add(Bsoustraction, 4, 5);
        gp.add(Bmultiplication, 4, 4);
        gp.add(Bdivision, 4, 3);
        gp.add(Bentrée, 4, 7);
        gp.add(Bpoint, 3, 7);
        gp.add(Bopposite, 1, 7);
        gp.add(Bpop, 3, 2);
        gp.add(Bdrop, 2, 3);
        gp.add(Bswap, 1, 3);
        gp.add(Bclear, 3, 3);
        gp.add(Berase, 3, 1);

        // Définit la taille des boutons (similaire pour tous les boutons)
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

        // Crée une instance du modèle (CalculatorModel) et du contrôleur (CalculatorControler)
        CalculatorModel model = new CalculatorModel();
        CalculatorControler controler = new CalculatorControler(this, model);

        // Associe des gestionnaires d'événements aux boutons pour que le contrôleur les gère
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
        Bdivision.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bmultiplication.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bopposite.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bpop.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bdrop.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bswap.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bclear.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Berase.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));

        Scene sc = new Scene(gp, 770, 720); // Crée une scène avec la grille

        stage.setScene(sc); // Définit la scène dans la fenêtre

        stage.show(); // Affiche la fenêtre
    }

    public static void main(String[] args) {
        launch(args); // Point d'entrée de l'application JavaFX
    }

    @Override
    public String LireEcran() {
        return this.ecran.getText(); // Lit le contenu de l'écran de la calculatrice
    }

    @Override
    public void setEcran(String string) {
        this.ecran.setText(string); // Définit le contenu de l'écran de la calculatrice
    }

    @Override
    public Label getMemoire() {
        return memoire; // Renvoie l'étiquette d'affichage de la mémoire
    }

    @Override
    public void setMemoire(List<Double> stackData) {
        this.memoire.setText(String.valueOf(stackData)); // Met à jour l'affichage de la pile dans l'interface utilisateur
    }
}
 
    
  

  