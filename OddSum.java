import java.util.Locale;
import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, swap, sum;
		
		System.out.println("Enter two numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			swap = x;
			x = y;
			y = swap;
		}
		
		sum = 0;
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		
		System.out.println("ODD SUM = " + sum);
		
		sc.close();

	}
}
