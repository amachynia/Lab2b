
public class pret extends pktMat{
	private double l; //długość
	
	public double getL(){ //akcesor
		return l;
	}
	
	public pret(){ //konstruktor domyślny
		super();
		l=0;
	}
	
	public pret(double m, double l){ //konstruktor z parametrem
		super(m);
		this.l=l;
	}
	
	public void zmien(double m, double l){ //zmiana zmiennych
		this.m=m;
		this.l=l;
	}
	
	public double momBez(){ //metoda obliczająca moment bezwładności
		double i=this.m*l*l/12;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Pret o dlugosci: " + l + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
	public void pretZM(){ //metoda pobierająca dane od użytkownika
		System.out.println("Podaj mase");
		sprawdzD();
		double m1=wczytaj.nextDouble();
		System.out.println("Podaj promien");
		sprawdzD();
		double l1=wczytaj.nextDouble();
		System.out.println("Podaj odleglosc od osi obrotu");
		sprawdzD();
		double d1=wczytaj.nextDouble();
		zmien(m1,l1);
		momBez();
		opis();
		System.out.println("Moment wzgledem nowej osi: " + steiner(d1));
	}
}
