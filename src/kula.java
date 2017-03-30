
public class kula extends pktMat{
	private double r; //promień
		
	public double getR(){ //akcesor
		return r;
	}
	
	public kula(){ //konstruktor domyślny
		super();
		r=0;
	}
	
	public kula(double m, double r){ //konstruktor z parametrem
		super(m);
		this.r=r;
	}
	
	public void zmien(double m, double r){ //zmiana zmiennych
		this.m=m;
		this.r=r;
	}
	
	public double momBez(){ //metoda obliczająca moment bezwładności
		double i=this.m*r*r*2/5;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Kula o promieniu: " + r + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
	public void kulaZM(){ //metoda pobierająca dane od użytkownika
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
