import java.util.Locale;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.print("How many numbers will you enter: ");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Entered a number: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println("\nEntered numbers: ");
		for (int i = 0; i < N; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		
		sc.close();;

	}
}
