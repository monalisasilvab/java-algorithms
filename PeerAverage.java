import java.util.Locale;
import java.util.Scanner;

public class PeerAverage {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numOfPairs = 0, sumOfPairs = 0;
		double avgPairs;
		
		System.out.println("How many elements will the vector have? ");
		int n = sc.nextInt();
		
		int[] vector = new int [n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vector[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (vector[i] % 2 == 0) {
				sumOfPairs += vector[i];
				numOfPairs++;
			}
		}
		
		if (numOfPairs == 0) {
			System.out.println("No even number");
		} 
		else {
			avgPairs = (double)sumOfPairs / numOfPairs; 
			System.out.printf("Average of even numbers = %.1f%n", avgPairs);
		}
		
		sc.close();
		
	}
}
