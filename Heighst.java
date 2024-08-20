import java.util.Locale;
import java.util.Scanner;

public class Heighst {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.println("How many people will be entered? ");
		n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%sst person data: \n", i + 1);
			System.out.print("Name: ");
			names[i] = sc.next();
			
			System.out.print("Age: ");
			ages[i] = sc.nextInt();
			
			System.out.print("Height: ");
			heights[i] = sc.nextDouble();
		}
		
		double totalHeight = 0.0;
		
		for (int i = 0; i < n; i++) {
			totalHeight += heights[i];
		}
		
		double averageHeight = totalHeight / n;
		
		System.out.println();
		System.out.printf("\nAverage height: %.2f%n", averageHeight);
				
		int underSixteen = 0; 
		
		for (int i = 0; i < n; i++) {
			if (ages[i] < 16) {
				underSixteen++;
			}
		}
		
		double percentage = underSixteen * 100.00 / n;
		System.out.printf("People under 16: %.1f%%%n", percentage);
		
		for (int i = 0; i < n; i++) {
			if (ages[i] < 16) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();
	}
}
