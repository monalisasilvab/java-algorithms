import java.util.Locale;
import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numMen, numWomen;
		double shorterHeight, greaterHeight, femaleHeight, avgfemaleHeight;
		
		System.out.println("How many people will be entered? ");
		int n = sc.nextInt();
		
		double[] heights = new double[n];
		char[] gender  = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%sst person height: ", i + 1);
			heights[i] = sc.nextDouble();
			
			System.out.printf("%sst person gender: ", i + 1);
			gender[i] = sc.next().charAt(0);
		}
		
		shorterHeight = heights[0];
		greaterHeight = heights[0];
		
		for (int i = 0; i < n; i++) {
			if (heights[i] > greaterHeight) {
				greaterHeight = heights[i];
			}
			if (heights[i] < shorterHeight) {
				shorterHeight = heights[i];
			}
		}
		
		numMen = 0;
		numWomen = 0;
		femaleHeight = 0;
		
		for (int i = 0; i < n; i++) {
			if (gender[i] == 'M') {
				numMen++;
			}
			else {
				numWomen++;
				femaleHeight += heights[i];
			}
		}
		
		avgfemaleHeight = femaleHeight / numWomen;
		
		System.out.printf("Shortest height = %.2f\n", shorterHeight);
		System.out.printf("Greater height = %.2f\n", greaterHeight);
		System.out.printf("Average height of women = %.2f\n", avgfemaleHeight);
		System.out.printf("Number of men = %d\n", numMen);
		
		sc.close();
		
	}
}
