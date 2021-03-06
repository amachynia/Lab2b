
public class walec extends pktMat {
	private double r; //promień
	
	public double getR(){ //akcesor
		return r;
	}
	
	public walec(){ //konstruktor domyślny
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
	
	public double momBez(){ //metoda obliczająca moment bezwładności
		double i=this.m*r*r/2;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Walec o promieniu: " + r + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
	public void walecZM(){ //metoda pobierająca dane od użytkownika
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
