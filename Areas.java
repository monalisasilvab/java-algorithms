import java.util.Locale;
import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x, y, z, areaTriangle, areaCircle, areaTrapeze, areaSquare, areaRectangle;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		areaTriangle = (x * z) / 2.0;
		areaCircle = 3.14159 * z * z;
		areaTrapeze = (x + y) / 2.0 * z;
		areaSquare = y * y;
		areaRectangle = x * y;
		
		System.out.printf("TRIANGLE: %.3f%n", areaTriangle);
		System.out.printf("CIRCLE: %.3f%n", areaCircle);
		System.out.printf("TRAPEZE: %.3f%n", areaTrapeze);
		System.out.printf("SQUARE: %.3f%n", areaSquare);
		System.out.printf("RECTANGLE: %.3f%n", areaRectangle);
		
		sc.close();
	}
}
