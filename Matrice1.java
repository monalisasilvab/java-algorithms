import java.util.Scanner;

public class Matrice1 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M, N;
		
		System.out.print("How many rows will the matrix have?");
		M = sc.nextInt();
		System.out.print("How many columns will the matrix have? ");
		N = sc.nextInt();
		
		int[][] array = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Element [" + i + "," + j + "]: ");
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nTyped array: ");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
