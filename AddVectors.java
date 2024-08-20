import java.util.Locale;
import java.util.Scanner;

public class AddVectors {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("How many values will each vector have ?");
		n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("Enter the values of vector a: ");
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the values of vector b: ");
		
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println("Resulting vector: ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", c[i]);
		}
		
		sc.close();
		
	}
}
