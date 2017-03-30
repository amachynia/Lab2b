
public class walec extends pktMat {
	private double r; //promie�
	
	public double getR(){ //akcesor
		return r;
	}
	
	public walec(){ //konstruktor domy�lny
		super();
		r=0;
	}
	
	public walec(double m, double r){ //konstruktor z parametrem
		super(m);
		this.r=r;
	}
	
	public void zmien(double m, double r){ //zmiana zmiennych
		this.m=m;
		this.r=r;
	}
	
	public double momBez(){ //metoda obliczaj�ca moment bezw�adno�ci
		double i=this.m*r*r/2;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Walec o promieniu: " + r + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
	public void walecZM(){ //metoda pobieraj�ca dane od u�ytkownika
		System.out.println("Podaj mase");
		sprawdzD();
		double m1=wczytaj.nextDouble();
		System.out.println("Podaj promien");
		sprawdzD();
		double r1=wczytaj.nextDouble();
		System.out.println("Podaj odleglosc od osi obrotu");
		sprawdzD();
		double d1=wczytaj.nextDouble();
		zmien(m1,r1);
		momBez();
		opis();
		System.out.println("Moment wzgledem nowej osi: " + steiner(d1));
	}
}
