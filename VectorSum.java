import java.util.Locale;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double sum, average;
		
		System.out.println("How many numbers will you enter ?");
		N = sc.nextInt();
		
		double[] vector = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			vector[i] = sc.nextDouble();
		}
		
		
		System.out.println();
		System.out.print("VALUES = ");
		for (int i = 0; i < N; i++) {
			System.out.print(String.format("%.1f ", vector[i]));
		}
		System.out.println();
		
		sum = 0;
		for (int i = 0; i < N; i++) {
			sum += vector[i];
		}
		System.out.println("SUM = " + String.format("%.2f", sum));
		
		average = sum / N;
		System.out.println("AVERAGE = " + String.format("%.2f", average));
		
		sc.close();

	}
}
