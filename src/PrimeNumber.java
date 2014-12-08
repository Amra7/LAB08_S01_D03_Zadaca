public class PrimeNumber {
	public static void main(String[] args) {
		int broj;
		System.out.println("Unesi jedan broj: ");
		broj = TextIO.getInt();

		int brojac =0;

		for (int i = 1; i <= broj; i++) {
			if (broj % i == 0) {
            brojac++;
            
			}
		}
	if (brojac==2) {
		System.out.println("It is  prime number");
	}else {
		System.out.println("It is not prime number");
	}
		
		
}
}
