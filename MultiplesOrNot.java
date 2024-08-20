import java.util.Scanner;

public class MultiplesOrNot {
    public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("They are multiple");
		}
		else {
			System.out.println("They are not multiple");
		}
		
		sc.close();
	}
}
