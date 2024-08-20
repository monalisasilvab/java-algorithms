import java.util.Locale;
import java.util.Scanner;

public class AmountToPay1 {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qtd1, cod2, qtd2;
		double value1, value2, total;
		
		 System.out.println("Enter the code, quantity and price of the first item:");
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		value1 = sc.nextDouble();
		
		System.out.println("Enter the code, quantity and price of the second item:");
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		value2 = sc.nextDouble();
		
		total = qtd1 * value1 + qtd2 * value2;
		
		System.out.printf("Item 1 (Code %d): %d units at %.2f each%n", cod1, qtd1, value1);
        System.out.printf("Item 2 (Code %d): %d units at %.2f each%n", cod2, qtd2, value2);
		System.out.printf("Amount to pay: R$ %.2f%n", total);
		
		sc.close();

	}
}
