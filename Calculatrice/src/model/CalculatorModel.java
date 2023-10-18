package model;

import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	
	public String acu = "";
	public Stack<Double> pile= new Stack<>(); 
	
	/*public double GetAcu (double acu) {
		return acu;
	}
	
	public void SetAcu(double acu) {
		this.acu=acu;
	}
	*/
	@Override
	public void add() {
		if (pile.size()>1) 
		{ // Une opération se fait à 2 elts
			Double e1 = pile.pop();
			Double e2 = pile.pop();
			pile.add(e2+e1);
		}
	}
	@Override	
	public void substract() {
		if (pile.size()>1) { // Une opération se fait à 2 elts
		Double e1 = pile.pop();
		Double e2 = pile.pop();
		pile.add(e2-e1);
		}
	}
	@Override
	public void multiply() {
		Double e1 = pile.pop();
		Double e2 = pile.pop();
		pile.add(e1*e2);
	}
	@Override
	public void divide() {
		if (pile.size()>1) {// Une opération se fait à 2 elts
		Double e1 = pile.pop();
		Double e2 = pile.pop();
		if (e2 != 0) {
		pile.add(e2/e1);
		}
		}
		
	}


	@Override
	public void opposite() {
		Double e1 = pile.pop();
		pile.add(-e1);
		
	}

	@Override
	public void push() {
		Double e1 = Double.valueOf(acu);
		pile.add(e1);
		
	}

	@Override
	public void pop() {
		pile.pop();
		
	}

	@Override
	public void drop() {
	acu = "";
	pile.pop();	
		
	}

	@Override
	public void swap() {
		if (pile.size()>1) { // Une opération se fait à 2 elts
			Double e1 = pile.pop();
			Double e2 = pile.pop();
			
            Stack<Double> tempStack = new Stack<>(); // Utiliser une deuxième pile temporaire pour stocker les deux derniers éléments
            
	        tempStack.push(e1);  // Échanger l'ordre des éléments dans la pile temporaire
	        tempStack.push(e2);
 
	        while (!tempStack.isEmpty()) { // Réinsérer les éléments dans la pile d'origine
	        	pile.push(tempStack.pop());
	        	}
			}
		}
   

	@Override
	public void clear() {
		acu = "";
        while (!pile.isEmpty()) { // Vider la pile en entier
            pile.pop();
            }
        }
		
		
		
		
	}

