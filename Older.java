import java.util.Locale;
import java.util.Scanner;

public class Older {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people will you type? ");
		int n = sc.nextInt();
		
		int olderAge, highestPosit;
		
		String[] names = new String[n];
		int[] ages = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%sst person data: \n", i + 1);
			System.out.print("Name: ");
			names[i] = sc.next();
			
			System.out.print("Ages: ");
			ages[i] = sc.nextInt();
		}
		
		olderAge = ages[0];
		highestPosit = 0;
		
		for (int i = 0; i < n; i++) {
			if (ages[i] > olderAge) {
				olderAge = ages[i];
				highestPosit = i;
			}
		}
		
		System.out.printf("Older person: %s\n", names[highestPosit]);
		
		sc.close();
		
	}
}
