import java.util.Locale;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdEven;
		
		System.out.println("How many numbers will you enter ?");
		n = sc.nextInt();
		
		int[] vector = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vector[i] = sc.nextInt();
		}
		
		System.out.println("\nEven Numbers: ");
		
		qtdEven = 0;
		
		for (int i = 0; i < n; i++) {
			if (vector[i] % 2 == 0) {
				System.out.printf("%d  ", vector[i]);
				qtdEven++;
			}
		}
		
		System.out.printf("\n\nNumber of pairs: %d\n", qtdEven);
		
		sc.close();
		
	}
}
