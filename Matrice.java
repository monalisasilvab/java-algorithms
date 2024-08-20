import java.util.Scanner;

public class Matrice {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();   // Number of lines
		int n = sc.nextInt();   // Number of columns
		int [][] matri = new int[m][n];     
		
		for (int i = 0; i < matri.length; i++) {
			for (int j = 0; j < matri[i].length; j++) {
				matri[i][j] = sc.nextInt();     
			}
		}
		
		int a = sc.nextInt();   // The value to be fetched is read
		
		for (int i = 0; i < matri.length; i++) {
			for (int j = 0; j < matri[i].length; j++) {
				if (matri[i][j] == a) {
					System.out.println("Position " + i + ", " + j + ": ");
					if (j > 0) {
						System.out.println("Left: " + matri[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matri[i - 1][j]);
					}
					if (j < matri[i].length - 1) {
						System.out.println("Right: " + matri[i][j + 1]);
					}
					if (i < matri.length - 1) {
						System.out.println("Down: " + matri[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
