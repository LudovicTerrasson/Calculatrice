package backend;

public class Multiplication extends Opération 
{
	public Multiplication(double nb1, double nb2) 
	{
		super(nb1, nb2);
	}
	
	public double calculer() 
	{
		return(this.nb1 * this.nb2);
	}

}
