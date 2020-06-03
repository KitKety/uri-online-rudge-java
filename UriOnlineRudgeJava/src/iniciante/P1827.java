package iniciante;

import java.util.Scanner;

public class P1827 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int position;
		while (sc.hasNext()) {
			n = sc.nextInt();
			int[][] matriz = new int[n][n];
			for (int i = 0; i < n; i++) {
				matriz[i][i] = 2;
				matriz[i][n - i - 1] = 3;
			}

			position = (int) n / 3;
			for (int a = position; a < n - position; a++) {
				for (int i = position; i < n - position; i++) {
					matriz[i][a] = 1;
				}
			}

			position = (n - 1) / 2;
			matriz[position][position] = 4;

			for (int j = 0; j < n; j++) {
				for (int i = 0; i < n; i++) {
					System.out.printf(matriz[j][i] + "");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
		sc.close();
	}

}
