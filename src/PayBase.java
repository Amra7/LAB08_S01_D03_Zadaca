
public class PayBase {
public static void main(String[] args) {
	
	int osnovica;
	System.out.println("Unesi osnovicu plate");
	osnovica = TextIO.getInt();
	
	int satnica;
	System.out.println("Unesi satnicu");
	satnica = TextIO.getInt();
	
	int brojSati;
	System.out.println("Unesi broj sati");
	brojSati = TextIO.getInt();
	
	int plata;
	plata = osnovica + (satnica * brojSati);
	
	System.out.printf("Iznos plate je %d", plata);
	
}
}
