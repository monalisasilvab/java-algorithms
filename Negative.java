import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("NEGATIVE");
		}
		else {
			System.out.println("NOT NEGATIVE");
		}
		
		sc.close();
	}
}
