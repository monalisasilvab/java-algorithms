import java.util.Scanner;

public class AmountToPay {
    public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int cod, qtd;
		
		double value = 0;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if (cod == 1) {
			value = qtd * 4.00;
		} 
		else if (cod == 2) {
			value = qtd * 4.50;
		}
		else if (cod == 3) {
			value = qtd * 5.00;
		}
		else if (cod == 4) {
			value = qtd * 2.00;
		}
		else if (cod == 5) {
			value = qtd * 1.50;
		}
		
		System.out.printf("Value: R$ %.2f%n", value);
		
		sc.close();
	}
}
