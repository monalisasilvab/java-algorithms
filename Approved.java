import java.util.Locale;
import java.util.Scanner;

public class Approved {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students will be typed? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		double[] note1 = new double[n];
		double[] note2 = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the name, first and second grade of the %sst student: \n", i + 1);
			sc.nextLine();
			names[i] = sc.nextLine();
			note1[i] = sc.nextDouble();
			note2[i] = sc.nextDouble();
		}
		
		System.out.println("Approved students: ");
		
		double average;
		
		for (int i = 0; i < n; i++) {
			average = (note1[i] + note2[i]) / 2;
			
			if (average >= 6.0) {
				System.out.printf("%s\n", names[i]);
			}
		}
		
		sc.close();
		
	}
}
