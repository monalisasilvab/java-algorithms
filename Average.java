import java.util.Locale;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			
			double average;
			average = (v1 * 2.0 + v2 * 3 + v3 * 5.0) / (2.0 + 3.0 + 5.0);
			
			System.out.printf("%.1f%n", average);
		}
	
		sc.close();
	}
}
