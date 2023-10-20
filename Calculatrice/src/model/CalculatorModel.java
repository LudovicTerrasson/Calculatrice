package model;

import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {

    // L'accumulateur qui stocke le résultat des opérations
    public String accu = "";
    // La pile qui stocke les nombres
    public Stack<Double> pile = new Stack<>();

    @Override
    public void add() {
        if (pile.size() > 1) { // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            pile.add(e2 + e1); // Ajoute le résultat de l'addition à la pile
        } else {
            accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
            // Si la pile ne contient pas suffisamment d'éléments, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void substract() {
        if (pile.size() > 1) { // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            pile.add(e2 - e1); // Ajoute le résultat de la soustraction à la pile
        } else {
            accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
            // Si la pile ne contient pas suffisamment d'éléments, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void multiply() {
        if (pile.size() > 1) { // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            pile.add(e1 * e2); // Ajoute le résultat de la multiplication à la pile
        } else {
            accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
            // Si la pile ne contient pas suffisamment d'éléments, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void divide() {
        if (pile.size() > 1) { // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            if (e1 != 0) { // Vérifie que le diviseur n'est pas zéro pour éviter une division par zéro
                pile.add(e2 / e1); // Ajoute le résultat de la division à la pile
            } else {
                accu = "Division par zéro impossible";
                // Si le diviseur est zéro, définissez un message d'erreur dans l'accumulateur
            }
        } else {
            accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
            // Si la pile ne contient pas suffisamment d'éléments, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void opposite() {
        if (pile.size() > 0) { // Vérifie s'il y a au moins un élément dans la pile
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            push(-e1); // Ajoute l'opposé de l'élément à la pile
        } else {
            accu = "Veuillez sélectionner un nombre pour en obtenir l'opposé";
            // Si la pile est vide, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void push(double nombre) {
        pile.add(nombre); // Ajoute un nombre à la pile
        accu = ""; // Efface le contenu de l'accumulateur
    }

    @Override
    public void pop() {
        if (pile.size() > 0) { // Vérifie s'il y a au moins un élément dans la pile
            Double e1 = pile.pop(); // Récupère le dernier élément de la pile
            accu = String.valueOf(e1); // Définit l'accumulateur avec la valeur récupérée
        } else {
            accu = "La pile est vide";
            // Si la pile est vide, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void drop() {
        if (pile.size() > 0) { // Vérifie s'il y a au moins un élément dans la pile
            pile.pop(); // Retire le dernier élément de la pile
        } else {
            accu = "La pile est vide";
            // Si la pile est vide, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void swap() {
        if (pile.size() > 1) { // Vérifie s'il y a suffisamment d'éléments dans la pile pour effectuer l'opération
            Double e1 = pile.pop(); // Récupère le premier élément de la pile
            Double e2 = pile.pop(); // Récupère le deuxième élément de la pile
            push(e1); // Ajoute le premier élément à la pile (swap)
            push(e2); // Ajoute le deuxième élément à la pile (swap)
        } else {
            accu = "Veuillez sélectionner deux opérandes avant de swap";
            // Si la pile ne contient pas suffisamment d'éléments, définissez un message d'erreur dans l'accumulateur
        }
    }

    @Override
    public void clear() {
        accu = ""; // Efface le contenu de l'accumulateur
        pile.clear(); // Vide complètement la pile
    }

    @Override
    public void erase() {
        if (accu.length() > 0) { // Vérifie s'il y a des caractères dans l'accumulateur
            accu = accu.substring(0, accu.length() - 1); // Efface le dernier caractère de l'accumulateur
        } else {
            accu = "L'accumulateur est déjà vide";
            // Si l'accumulateur est déjà vide, définissez un message d'erreur dans l'accumulateur
        }
    }
}


