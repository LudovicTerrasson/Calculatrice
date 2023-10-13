package backend;

public abstract class Opération 
{
	double nb1;
	double nb2;
	
	public Opération(double nb1, double nb2) 
	{
		this.nb1=nb1;
		this.nb2=nb2;
	}
	public abstract double calculer();
}
