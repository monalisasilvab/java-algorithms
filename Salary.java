import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hours;
		double valueHour, salary;
		
		num = sc.nextInt();
		hours = sc.nextInt();
		valueHour = sc.nextDouble();
		
		salary = valueHour * hours;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}
}
