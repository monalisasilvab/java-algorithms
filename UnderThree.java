import java.util.Locale;
import java.util.Scanner;

public class UnderThree {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, smallest;
		
		System.out.print("First value: ");
		a = sc.nextInt();
		System.out.print("Second value: ");
		b = sc.nextInt();
		System.out.print("Third value: ");
		c = sc.nextInt();
		
		if (a < b && a < c) {
			smallest = a;
		}
		else if (b < c) {
			smallest = b;
		}
		else {
			smallest = c;
		}
		
		System.out.println("SMALLEST = " + smallest);
		
		sc.close();
	}
}
