package view;

import java.util.List;
import java.util.ArrayList;

import controler.CalculatorControler;
import controler.CalculatorControlerInterface;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.CalculatorModel;
import model.CalculatorModelInterface;

public class CalculatorGUI extends Application implements CalculatorGUIInterface {
	// La classe CalculatorGUI gère l'interface utilisateur de la calculatrice.

	private TextField ecran = new TextField(); // Champ de texte pour l'écran de la calculatrice
	private Label memoire = new Label(); // Étiquette pour afficher la mémoire (pile)

	// Boutons de la calculatrice

	private List<Button> Buttons = new ArrayList<>();
	CalculatorModelInterface model = new CalculatorModel();
	CalculatorControlerInterface controler = new CalculatorControler(this, model);
	
	
	@Override
	public void start(Stage stage) {
		// Configuration de l'interface utilisateur de la calculatrice

		// Création des boutons en variables et ajout dans une liste
		Buttons.add(new Button("swap"));
		Buttons.add(new Button("drop"));
		Buttons.add(new Button("C"));
		Buttons.add(new Button("/"));
		Buttons.add(new Button("7"));
		Buttons.add(new Button("8"));
		Buttons.add(new Button("9"));
		Buttons.add(new Button("x"));
		Buttons.add(new Button("4"));
		Buttons.add(new Button("5"));
		Buttons.add(new Button("6"));
		Buttons.add(new Button("-"));
		Buttons.add(new Button("1"));
		Buttons.add(new Button("2"));
		Buttons.add(new Button("3"));
		Buttons.add(new Button("+"));
		Buttons.add(new Button("opposite"));
		Buttons.add(new Button("0"));
		Buttons.add(new Button("."));
		Buttons.add(new Button("push"));
		Buttons.add(new Button("pop"));
		Buttons.add(new Button("<="));


		stage.setTitle("Luna Calculette"); // Titre de la fenêtre

		GridPane gp = new GridPane(); // Crée un gestionnaire de mise en page (grille)

		gp.setHgap(10); // Espacement horizontal entre les éléments de la grille
		gp.setVgap(10); // Espacement vertical entre les éléments de la grille

		GridPane.setColumnSpan(ecran, 2); // L'écran s'étend sur 2 colonnes
		GridPane.setRowSpan(ecran, 2); // L'écran s'étend sur 2 lignes
		ecran.setPrefHeight(150); // Hauteur de l'écran
		ecran.setStyle("-fx-font-size: 15px;");
		gp.add(ecran, 1, 1); // Ajoute l'écran à la grille

		GridPane.setColumnSpan(memoire, 1); // La mémoire s'étend sur 1 colonne
		memoire.setStyle("-fx-font-size: 15px;");
		gp.add(memoire, 4, 1); // Ajoute l'affichage de la mémoire à la grille

		// Ajoute et positionne les boutons sur la grille en les paramettrant (couleur, police..)
		int ligne = 3;
		int colonne = 1;
		for (int i = 0; i < Buttons.size(); i++) {
			
			if (Buttons.get(i).getText() == "pop" || Buttons.get(i).getText() == "<=") {
				Buttons.get(i).setPrefWidth(100);
				Buttons.get(i).setPrefHeight(70);
				gp.add(Buttons.get(i), 3, -(i-Buttons.size())); //Ajoute sur le gp, les 2 boutons à coté de l'affichage
				Buttons.get(i).setStyle(
						"-fx-font-size: 20px; -fx-background-color: #d5f0ff; -fx-border-color: grey; -fx-border-width: 1px;");
			
			} else {
				gp.add(Buttons.get(i), colonne, ligne);
				if(ligne==3 || colonne == 4 || (ligne == 7 && Buttons.get(i).getText() != "0")){
					Buttons.get(i).setStyle(
							"-fx-font-size: 20px; -fx-background-color: #d5f0ff; -fx-border-color: grey; -fx-border-width: 1px;");
				}
				else {	
				Buttons.get(i).setStyle(
						"-fx-font-size: 20px; -fx-background-color:  #8faef0 ; -fx-border-color: grey; -fx-border-width: 1px;");
				}
				// Définit la taille des boutons (similaire pour tous les boutons sauf 2)
				Buttons.get(i).setPrefWidth(180);
				Buttons.get(i).setPrefHeight(100);

				colonne++;
				if (colonne > 4) { // On change de ligne si on arrive au bout
					colonne = 1;
					ligne++;
				}
			}
		}
		


		// Associe des gestionnaires d'événements aux boutons pour que le contrôleur les
		// gère

		for (int i = 0; i < Buttons.size(); i++) {
			Buttons.get(i).addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));

		}

		Scene sc = new Scene(gp, 770, 720); // Crée une scène avec la grille

		stage.setScene(sc); // Définit la scène dans la fenêtre

		stage.show(); // Affiche la fenêtre
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
		this.memoire.setText(String.valueOf(stackData)); // Met à jour l'affichage de la pile dans l'interface
															// utilisateur
	}


}