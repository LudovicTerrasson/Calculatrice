package frontend;

import backend.*;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;



public class Main extends Application 
{
    public static void main(String[] args) 
    {
        launch(args);
    }
    @Override
    public void start(Stage st) throws Exception 
    {
        // Etape I : Création de ma calculatrice
        Calculatrice Luna = new Calculatrice();

        // Etape II : Affectation d'un nom pour ma calculatrice
        st.setTitle("Luna Calculette");
        
        
        
        // Etape III : Création d'un gestionnaire pour organiser et placer les éléments de ma calculatrice
        GridPane gp = new GridPane();
        
        // Réglage (esthétique) de l'écart entre les éléments de ma calculatrice
        gp.setHgap(10);
        gp.setVgap(10);
     
        
        
        // Etape IV : Création d'un écran pour ma calculatrice
        TextField écran = new TextField();
        
        // Réglage (esthétique) de la position de l'écran sur ma calculatrice
        GridPane.setColumnSpan(écran, 2); // S'étend sur 2 colonnes
        
        // Règlage (esthétique) de la taille de l'écran de ma calculatrice
        écran.setPrefWidth(180); // Largeur de 180 pixels
        écran.setPrefHeight(100); // Hauteur de 100 pixels
        
        // Ajout et positionnement de l'écran sur ma calculatrice
        gp.add(écran,1,1);
        
        
        
        // Etape V : Création d'une mémoire pour ma calculatrice
        Label memoire = new Label();
        
        // Réglage (esthétique) de la position de la mémoire sur ma calculatrice
        GridPane.setColumnSpan(memoire, 2); // S'étend sur 2 colonnes
        
        // Ajout et positionnement de la mémoire sur ma calculatrice
        gp.add(memoire, 3, 1);
 
        
        
        // Etape VI : Création des boutons de ma calculatrice
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
        
        
        
        // Etape VII : Implémentation des méthodes qui s'activeront lorsque les bouttons seront actionnés
        
        // Méthode associée au boutton 0
        B0.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            // Si l'utilisateur vient de faire une erreur 
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("0");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"0");
            }
        }
        });
        
        // Méthode associée au boutton 1
        B1.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("1");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"1");
            }
        }
        });
        
        // Méthode associée au boutton 2
        B2.setOnAction(new EventHandler<ActionEvent>() {
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("2");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"2");
            }
        }
        });
        
        // Méthode associée boutton au 3
        B3.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("3");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"3");
            }
        }
        });
        
        // Méthode associée au boutton 4
        B4.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("4");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"4");
            }
        }
        });
        
        // Méthode associée au boutton 5
        B5.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("5");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"5");
            }
        }
        });
        
        // Méthode associée au boutton 6
        B6.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("6");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"6");
            }
        }
        });
        
        // Méthode associée au boutton 7
        B7.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("7");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"7");
            }
        }
        });
        
        // Méthode associée au boutton 8
        B8.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("8");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"8");
            }
        }
        });
        
        // Méthode associée au boutton 9
        B9.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText("9");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+"9");
            }
        }
        });
        
        // Méthode associée au boutton .
        Bpoint.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            // Lecture de l'écran
            String lu = écran.getText();
            
            // Si l'utilisateur vient de faire une erreur
            if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
            {
                // Suppression du message d'erreur et ajout du chiffre a l'écran
                écran.setText(".");
            }
            // Sinon, alors aucune erreur
            else
            {
                // Ajout du chiffre a l'écran
                écran.setText(lu+".");
            }
        }
        });
        
        // Méthode associée boutton entrée
        Bentrée.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            double lu = Double.valueOf(écran.getText());
            
            if(Luna.mémoire[0]==null)
            {
                Luna.mémoire[0]=lu;
            }
            else if(Luna.mémoire[1]==null)
            {
                Luna.mémoire[1]=lu;
            }
            else if(Luna.mémoire[2]==null)
            {
                Luna.mémoire[2]=lu;
            }
            else if(Luna.mémoire[3]==null)
            {
                Luna.mémoire[3]=lu;
            }
            else if(Luna.mémoire[4]==null)
            {
                Luna.mémoire[4]=lu;
            }
            else
            {
                Luna.mémoire[0]=Luna.mémoire[1];
                Luna.mémoire[1]=Luna.mémoire[2];
                Luna.mémoire[2]=Luna.mémoire[3];
                Luna.mémoire[3]=Luna.mémoire[4];
                Luna.mémoire[4]=lu;
            }
            écran.setText("");
            memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
        }
        });
        
        // Méthode associée boutton .
        Baddition.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            if(Luna.mémoire[0]==null)
            {
                écran.setText("Veuillez choisir les deux opérandes avant de choisir l'opération");
            }
            else if(Luna.mémoire[1]==null)
            {
                écran.setText("Veuillez choisir les deux opérandes avant de choisir l'opération");
            }
            else if(Luna.mémoire[2]==null)
            {
                Addition A1 = new Addition(Luna.mémoire[0], Luna.mémoire[1]);
            
                double resultat =Luna.calculer(A1);
                Luna.mémoire[2]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else if(Luna.mémoire[3]==null)
            {
                Addition A1 = new Addition(Luna.mémoire[1], Luna.mémoire[2]);
            
                double resultat =Luna.calculer(A1);
                Luna.mémoire[3]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else if(Luna.mémoire[4]==null)
            {
                Addition A1 = new Addition(Luna.mémoire[2], Luna.mémoire[3]);
            
                double resultat =Luna.calculer(A1);
                Luna.mémoire[4]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else
            {
                Addition A1 = new Addition(Luna.mémoire[3], Luna.mémoire[4]);
            
                double resultat =Luna.calculer(A1);
                Luna.mémoire[0]=Luna.mémoire[1];
                Luna.mémoire[1]=Luna.mémoire[2];
                Luna.mémoire[2]=Luna.mémoire[3];
                Luna.mémoire[3]=Luna.mémoire[4];
                Luna.mémoire[4]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
        }
        });
        
        // Méthode associée boutton .
        Bsoustraction.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            if(Luna.mémoire[0]==null)
            {
                écran.setText("Veuillez choisir les deux opérandes avant de choisir l'opération");
            }
            else if(Luna.mémoire[1]==null)
            {
                écran.setText("Veuillez choisir les deux opérandes avant de choisir l'opération");
            }
            else if(Luna.mémoire[2]==null)
            {
                Soustraction S1 = new Soustraction(Luna.mémoire[0], Luna.mémoire[1]);
            
                double resultat =Luna.calculer(S1);
                Luna.mémoire[2]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else if(Luna.mémoire[3]==null)
            {
                Soustraction S1 = new Soustraction(Luna.mémoire[1], Luna.mémoire[2]);
            
                double resultat =Luna.calculer(S1);
                Luna.mémoire[3]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else if(Luna.mémoire[4]==null)
            {
                Soustraction S1 = new Soustraction(Luna.mémoire[2], Luna.mémoire[3]);
            
                double resultat =Luna.calculer(S1);
                Luna.mémoire[4]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else
            {
                Soustraction S1 = new Soustraction(Luna.mémoire[3], Luna.mémoire[4]);
            
                double resultat =Luna.calculer(S1);
                Luna.mémoire[0]=Luna.mémoire[1];
                Luna.mémoire[1]=Luna.mémoire[2];
                Luna.mémoire[2]=Luna.mémoire[3];
                Luna.mémoire[3]=Luna.mémoire[4];
                Luna.mémoire[4]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
        }
        });
        
        // Méthode associée boutton .
        Bmultiplication.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            if(Luna.mémoire[0]==null)
            {
                écran.setText("Veuillez choisir les deux opérandes avant de choisir l'opération");
            }
            else if(Luna.mémoire[1]==null)
            {
                écran.setText("Veuillez choisir les deux opérandes avant de choisir l'opération");
            }
            else if(Luna.mémoire[2]==null)
            {
                Multiplication M1 = new Multiplication(Luna.mémoire[0], Luna.mémoire[1]);
            
                double resultat =Luna.calculer(M1);
                Luna.mémoire[2]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else if(Luna.mémoire[3]==null)
            {
                Multiplication M1 = new Multiplication(Luna.mémoire[1], Luna.mémoire[2]);
            
                double resultat =Luna.calculer(M1);
                Luna.mémoire[3]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else if(Luna.mémoire[4]==null)
            {
                Multiplication M1 = new Multiplication(Luna.mémoire[2], Luna.mémoire[3]);
            
                double resultat =Luna.calculer(M1);
                Luna.mémoire[4]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else
            {
                Multiplication M1 = new Multiplication(Luna.mémoire[3], Luna.mémoire[4]);
            
                double resultat =Luna.calculer(M1);
                Luna.mémoire[0]=Luna.mémoire[1];
                Luna.mémoire[1]=Luna.mémoire[2];
                Luna.mémoire[2]=Luna.mémoire[3];
                Luna.mémoire[3]=Luna.mémoire[4];
                Luna.mémoire[4]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
        }
        });
        
        // Méthode associée boutton .
        Bdivision.setOnAction(new EventHandler<ActionEvent>() {
            
        //Redéfinition de la méthode pour qu'elle soit propre a ce bouton
        @Override
        public void handle(ActionEvent e) 
        {
            if(Luna.mémoire[0]==null)
            {
                écran.setText("Veuillez choisir les deux opérandes avant de choisir l'opération");
            }
            else if(Luna.mémoire[1]==null)
            {
                écran.setText("Veuillez choisir les deux opérandes avant de choisir l'opération");
            }
            else if(Luna.mémoire[2]==null)
            {
                Division D1 = new Division(Luna.mémoire[0], Luna.mémoire[1]);
            
                double resultat =Luna.calculer(D1);
                Luna.mémoire[2]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else if(Luna.mémoire[3]==null)
            {
                Division D1 = new Division(Luna.mémoire[1], Luna.mémoire[2]);
            
                double resultat =Luna.calculer(D1);
                Luna.mémoire[3]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else if(Luna.mémoire[4]==null)
            {
                Division D1 = new Division(Luna.mémoire[2], Luna.mémoire[3]);
            
                double resultat =Luna.calculer(D1);
                Luna.mémoire[4]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
            else
            {
                Division D1 = new Division(Luna.mémoire[3], Luna.mémoire[4]);
            
                double resultat =Luna.calculer(D1);
                Luna.mémoire[0]=Luna.mémoire[1];
                Luna.mémoire[1]=Luna.mémoire[2];
                Luna.mémoire[2]=Luna.mémoire[3];
                Luna.mémoire[3]=Luna.mémoire[4];
                Luna.mémoire[4]=resultat;
            
                // Ajout du chiffre a l'écran
                memoire.setText(String.valueOf(Luna.mémoire[4])+"    "+
                            String.valueOf(Luna.mémoire[3])+"    "+
                            String.valueOf(Luna.mémoire[2])+"    "+
                            String.valueOf(Luna.mémoire[1])+"    "+
                            String.valueOf(Luna.mémoire[0])+"    ");
            }
        }
        });
        
        
        
        // Etape VIII : Ajout du gestionnaire contenant l'écran et les boutons à ma scène
        Scene sc = new Scene(gp, 770, 570);

        
        
        // Etape IX : Ajout de ma scène à ma calculatrice
        st.setScene(sc);
        
        
        
        // Etape X : Affichage de ma calculatrice
        st.show(); 
    }
}


