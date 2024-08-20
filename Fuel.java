import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int type, alcohol, gasoline, diesel;
		
		alcohol = 0;
		gasoline = 0;
		diesel = 0;
		
		type = sc.nextInt();
		
		while (type != 4) {
			
			if (type == 1) {
				alcohol += 1;
			}
			else if (type == 2) {
				gasoline += 1;
			}
			else if (type == 3) {
				diesel += 1;
			}
			
			type = sc.nextInt();
			
		}
		
		System.out.println("Thank you very much");
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gasoline: " + gasoline);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
