import java.util.Scanner;

public class pktMat {
	static Scanner wczytaj = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
	protected double m; //masa
	public pktMat(){ //konstruktor domy�lny
		m=1;
	}
	public pktMat(double a){ //konstruktor z parametrem
		if(a>0)
		{
			m=a;
		}else{
			System.out.println("Masa musi byc wieksza od zera");
		}
	}
	public double getMasa(){ //akcesor
		return m;
	}
	public double zmienMase(double c){ //zmiana masy
		m = c;
		return m;
	}
	public double momBez(){ //metoda obliczaj�ca moment bezw�adno�ci
		double i=0;
		return i;
	}
	public double steiner(double d){ //metoda obliczaj�ca moment bezw�ado�ci z twierdzenia Steinera
		double is;
		
		is=momBez()+m*d*d;
		return is;
	}
	public void opis(){ //metoda zwracaj�ca opis
		System.out.println("Punkt materialny");
	}
	public static void sprawdz()
	{
		while (!wczytaj.hasNextInt()){
	    	System.out.println("Podaj liczbe calkowita");
	    	wczytaj.next();
	    }
	}
	public static void sprawdzD()
	{
		while (!wczytaj.hasNextDouble()){
	    	System.out.println("Podaj liczbe (przecinek, nie kropka)");
	    	wczytaj.next();
	    }
	}
}