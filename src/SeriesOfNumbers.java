
public class SeriesOfNumbers {
public static void main(String[] args) {
	int broj;
	int suma=0;
	do {
		System.out.println("Unesi prvi broj: ");
		broj = TextIO.getInt();
	    suma = suma + broj;
		
		} while (broj!=0);
	
}
}
