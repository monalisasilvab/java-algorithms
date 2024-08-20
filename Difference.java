import java.util.Scanner;

public class Difference {
   public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y, w, z, dif;
		
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		z = sc.nextInt();
		
		dif = x * y - w * z;
		
		System.out.print("Difference = " + dif);
		
		sc.close();
	} 
}
