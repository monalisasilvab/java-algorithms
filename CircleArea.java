import java.util.Locale;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ray, area, pi;
		
		pi = 3.14159;
		
		ray = sc.nextDouble();
		
		area = pi * Math.pow(ray, ray);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}
}
