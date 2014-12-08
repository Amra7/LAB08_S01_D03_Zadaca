
public class TwoNumbers {
 public static void main(String[] args) {
	double a,b;
	
	do {
		System.out.printf("%nUnesi prvi broj");
		 a = TextIO.getDouble();
		System.out.println("Unesi drugi broj");
		 b = TextIO.getDouble();
		  
		
	
		 System.out.printf("Suma dva boje je: %f %f %f %f ", a+b, a-b, a*b, a%b);
		 
	} while ((a!=0) || (b!=0));
		
		
	}
	}

