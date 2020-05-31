package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class P1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lados = new int[4];
		lados[0] = sc.nextInt();
		lados[1] = sc.nextInt();
		lados[2] = sc.nextInt();
		lados[3] = sc.nextInt();
		sc.close();

		Arrays.sort(lados);
		if ((lados[0] + lados[1] > lados[2] && lados[0] + lados[2] > lados[1] && lados[2] + lados[1] > lados[0])
				|| (lados[1] + lados[2] > lados[3] && lados[1] + lados[3] > lados[2] && lados[3] + lados[2] > lados[1])
				|| (lados[0] + lados[2] > lados[3] && lados[0] + lados[3] > lados[2] && lados[3] + lados[2] > lados[0])
				|| (lados[0] + lados[1] > lados[3] && lados[0] + lados[3] > lados[1]
						&& lados[3] + lados[1] > lados[0])) {
			System.out.printf("S\n");
		} else
			System.out.printf("N\n");

	}

}
