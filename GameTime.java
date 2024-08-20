import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int startTime, endTime, duration;
		
		startTime = sc.nextInt();
		endTime = sc.nextInt();
		
		if (startTime < endTime) {
			duration = endTime - startTime;
		}
		else {
			duration = 24 - startTime + endTime;
		}
		
		System.out.println("GAME DURATION: " + duration + " HOUR(S)");
		
		sc.close();
	}
}
