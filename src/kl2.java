public class kl2 {
	
	
	public static void main(String[] args) {
		int wybor;
		int a;
		//pktMat p = new pktMat();
	    
	    //menu
		while(true){
	    	System.out.println("Wybierz bryle: ");
		    System.out.println("1.Kula");
		    System.out.println("2.Walec");
		    System.out.println("3.Pret");
		    System.out.println("4.Wyjdz");
		    pktMat.sprawdz();
		    wybor = pktMat.wczytaj.nextInt(); //Wczytanie wybranego numeru
		    switch(wybor){
		    case 1:
		    	System.out.println("Wybrales kule");
		    	kula k1 = new kula();
		    	k1.kulaZM();
		    	do{
		    		System.out.println("Aby wrocic do menu wcisnij 1");
		    		pktMat.sprawdz();
			    	a=pktMat.wczytaj.nextInt();
		    	}while(a!=1);
		    	break;
		    case 2:
		    	System.out.println("Wybrales walec");
		    	walec w1 = new walec();
		    	w1.walecZM();
		    	do{
		    		System.out.println("Aby wrocic do menu wcisnij 1");
		    		pktMat.sprawdz();
			    	a=pktMat.wczytaj.nextInt();
		    	}while(a!=1);
		    	break;
		    case 3:
		    	System.out.println("Wybrales pret");
		    	pret p1 = new pret();
		    	p1.pretZM();
		    	do{
		    		System.out.println("Aby wrocic do menu wcisnij 1");
		    		pktMat.sprawdz();
			    	a=pktMat.wczytaj.nextInt();
		    	}while(a!=1);
		    	break;
		    case 4:
		    	System.out.println("Koniec");
		    	pktMat.wczytaj.close();
		    	return;
		    default:
		    	System.out.println("Bledny wybor");
		       ;
		}
	  }
	}
}
