import java.util.Locale;
import java.util.Scanner;

public class HighestPosition {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, higPosition;
		double higherNumber;
		
		System.out.println("How many numbers will you enter ?");
		n = sc.nextInt();
		
		double[] vector = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vector[i] = sc.nextDouble();
		}
		
		higherNumber = vector[0];
		higPosition = 0;
		
		for (int i = 1; i < n; i++) {
			if (vector[i] > higherNumber) {
				higherNumber = vector[i];
				higPosition = i;
			}
		}
		
		System.out.printf("\nHighest value: %.1f\n", higherNumber);
		System.out.printf("Position of Highest value: %d\n", higPosition);
		
		sc.close();
		
	}
}
