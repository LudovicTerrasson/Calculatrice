package model;

import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface 
{
    // L'accumulateur qui stocke le résultat des opérations
    private String accu = "";
    // La pile qui stocke les nombres
    private Stack<Double> pile = new Stack<>();

    //Getter et setter de accu car en private
    public void setAccu(String accu) 
    {
    	this.accu = accu ;
    }
    
    public String getAccu() 
    {
    	return accu;
    }
  //Getter et setter de pile car en private
    public void setPile(Stack<Double> pile) 
    {
    	this.pile = pile ;
    }
    
    public Stack<Double> getPile() 
    {
    	return pile;
    }
    
    @Override
    public void add() 
    {
        // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
        if (pile.size() > 1) 
        { 
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            pile.add(e2 + e1); // Ajoute le résultat de l'addition à la pile
        } 
        // Sinon, la pile ne contient pas suffisamment d'éléments, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : Veuillez choisir les deux opérandes avant de choisir l'opération";
            // Si la pile ne contient pas suffisamment d'éléments, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void substract() 
    {
        // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
        if (pile.size() > 1) 
        { 
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            pile.add(e2 - e1); // Ajoute le résultat de la soustraction à la pile
        }
        //Sinon, la pile ne contient pas suffisamment d'éléments, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : Veuillez choisir les deux opérandes avant de choisir l'opération";
        }
    }

    @Override
    public void multiply() 
    {
        // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
        if (pile.size() > 1) 
        { 
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            pile.add(e1 * e2); // Ajoute le résultat de la multiplication à la pile
        } 
        //Sinon, la pile ne contient pas suffisamment d'éléments, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : Veuillez choisir les deux opérandes avant de choisir l'opération";
        }
    }

    @Override
    public void divide() 
    {
        // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
        if (pile.size() > 1) 
        { 
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            // Vérifie que le diviseur n'est pas zéro pour éviter une division par zéro
            if (e1 != 0) 
            { 
                pile.add(e2 / e1); // Ajoute le résultat de la division à la pile
            } 
            // Sinin, le diviseur est zéro, donc affichage d'un message d'erreur dans l'accumulateur
            else 
            {
                accu = "Erreur : Division par zéro impossible";
            }
        } 
        //Sinon, la pile ne contient pas suffisamment d'éléments, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : Veuillez choisir les deux opérandes avant de choisir l'opération";
        }
    }

    @Override
    public void opposite() 
    {
        // Vérifie s'il y a au moins un élément dans la pile
        if (pile.size() > 0) 
        { 
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            // Si le nombre est positif, on l'affiche derrière un signe moins pour obtenir l'opposé
            if(e1>=0)
            {
                accu="-"+String.valueOf(e1); // Met a jour l'accumulateur
                push(); // Ajoute l'opposé de l'élément à la pile
            }
            // Sinon, le nombre est négatif donc on affiche la valeur de son opposé
            else
            {
                e1=-e1; // On prend l'opposé
                accu=String.valueOf(e1); // Met a jour l'accumulateur
                push(); // Ajoute l'opposé de l'élément à la pile
            }
        } 
        //Sinon, la pile est vide, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : Veuillez sélectionner un nombre pour en obtenir l'opposé";
        }
    }

    @Override
    public void push() 
    {
    	// Si l'accumulateur est vide, on affiche le message d'erreur
    	if(accu=="")
        {
            accu = "Veuillez sélectionner un nombre avant de push";
        }
    	// Sinon, alors on peut push
        else
        {
            double nombre = Double.valueOf(accu); // on récupère la valeur contenu dans l'accumulateur
            pile.add(nombre); // Ajoute un nombre à la pile
            accu = ""; // Efface le contenu de l'accumulateur
        }
    }

    @Override
    public void pop() 
    {
        // Vérifie s'il y a au moins un élément dans la pile
        if (pile.size() > 0) 
        { 
            Double e1 = pile.pop(); // Récupère le dernier élément de la pile
            accu = String.valueOf(e1); // Définit l'accumulateur avec la valeur récupérée
        }
        //Sinon, la pile est vide, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : La pile est vide";
        }
    }

    @Override
    public void drop() 
    {
        // Vérifie s'il y a au moins un élément dans la pile
        if (pile.size() > 0) 
        { 
            pile.pop(); // Retire le dernier élément de la pile
        } 
        //Sinon, la pile est vide, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : La pile est vide";
        }
    }

    @Override
    public void swap() 
    {
        // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
        if (pile.size() > 1) 
        { 
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            accu = String.valueOf(e1); // Définit l'accumulateur avec la valeur récupérée
            push(); // Ajoute le premier élément à la pile (swap)
            accu = String.valueOf(e2); // Définit l'accumulateur avec la valeur récupérée
            push(); // Ajoute le deuxième élément à la pile (swap)
        } 
        //Sinon, la pile ne contient pas suffisamment d'éléments, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : Veuillez sélectionner deux opérandes avant de swap";
        }
    }

    @Override
    public void clear() 
    {
        accu = ""; // Efface le contenu de l'accumulateur
        pile.clear(); // Vide complètement la pile
    }

    @Override
    public void erase() 
    {
        // Vérifie s'il y a des caractères dans l'accumulateur
        if (accu.length() > 0) 
        { 
            accu = accu.substring(0, accu.length() - 1); // Efface le dernier caractère de l'accumulateur
        } 
        // Sinon, l'accumulateur est déjà vide, donc affichage d'un message d'erreur dans l'accumulateur
        else 
        {
            accu = "Erreur : L'accumulateur est déjà vide";
        }
    }
}


