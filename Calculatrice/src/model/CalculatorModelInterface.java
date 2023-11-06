package model;

import java.util.Stack;

public interface CalculatorModelInterface 
{
    // Méthode pour effectuer une addition
    public void add();

    // Méthode pour effectuer une soustraction
    public void substract();

    // Méthode pour effectuer une multiplication
    public void multiply();

    // Méthode pour effectuer une division
    public void divide();

    // Méthode pour obtenir l'opposé d'un nombre
    public void opposite();

    // Méthode pour empiler un nombre
    public void push();

    // Méthode pour récupérer un nombre de la pile
    public void pop();

    // Méthode pour retirer un élément de la pile
    public void drop();

    // Méthode pour échanger les deux éléments du sommet de la pile
    public void swap();

    // Méthode pour vider la pile
    public void clear();

    // Méthode pour effacer le dernier caractère de l'accumulateur
    public void erase();
    
    //getter et setter accu
    public void setAccu(String accu);
    public String getAccu();
    
    //getter et setter pile
    public void setPile(Stack<Double> pile);
    public Stack<Double> getPile();
    
}
