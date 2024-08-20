import java.util.Locale;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double wage, incomeTax;
		
		wage = sc.nextDouble();
		
		if (wage <= 2000.0) {
			incomeTax = 0.0;
		}
		else if (wage <= 3000.0) {
			incomeTax = (wage - 2000.0) * 0.08; 
		}
		else if (wage <= 4500.0) {
			incomeTax = (wage - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			incomeTax = (wage - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (incomeTax == 0.0) {
			System.out.println("Exempt");
		}
		else {
			System.out.printf("R$ %.2f%n", incomeTax);
		}
		
		sc.close();
	}
}
