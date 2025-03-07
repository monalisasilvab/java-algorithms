import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		int in, out;
		
		in = 0;
		out = 0;
		
		for (int i = 0; i < n; i++) {
			
			int x;
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {	// range [10,20]
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
