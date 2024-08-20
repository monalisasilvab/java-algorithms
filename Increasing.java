import java.util.Locale;
import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Enter two numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("Increasing");
			}
			else {
				System.out.println("Decreasing");
			}
			System.out.println("Enter another two numbers: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
