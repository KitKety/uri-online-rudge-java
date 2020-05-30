package iniciante;

import java.util.Scanner;

public class P1973 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] carneiros = new int[n];
		int[] atacadas = new int[n];
		long total = 0;
		for (int i = 0; i < n; i++) {
			carneiros[i] = sc.nextInt();
			total += carneiros[i];
		}
		sc.close();

		int c = 0;
		long roubados = 0;

		while (true) {
			if ((c > n - 1) || (c < 0))
				break;

			if (carneiros[c] > 0) {
				carneiros[c]--;
				roubados++;
				atacadas[c] = 1;

				if ((carneiros[c] + 1) % 2 != 0)
					c += 2;
			}

			c--;
		}

		int estrelas = 0;
		for (int atacada : atacadas) {
			estrelas += atacada;
		}

		System.out.printf("%d %d\n", estrelas, (total - roubados));
	}

}
