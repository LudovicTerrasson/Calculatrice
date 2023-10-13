package backend;

public class Main {
	public static void main(String[]args) 
	{	
		Addition A1 = new Addition(9,4);
		System.out.println(A1.calculer());
		
		Soustraction S1 = new Soustraction(2.3,8.0);
		System.out.println(S1.calculer());
		
		Multiplication M1 = new Multiplication(189654.986,1543.8);
		System.out.println(M1.calculer());
		
		Division D1 = new Division(36.89,11.7);
		System.out.println(D1.calculer());
	}
}
