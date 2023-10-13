package backend;

public class Calculatrice {

	public Double [] mémoire = new Double [5];
	
	public Calculatrice() 
	{
		
	}
	
	public double calculer(Opération O) 
	{
		double résultat = O.calculer();
		return résultat;
	}
}
