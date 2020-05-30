package iniciante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> results = new ArrayList<Integer>();
		int[] velocidades;
		int n;
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			velocidades = new int[n];
			for (int i = 0; i < n; i++) {
				velocidades[i] = sc.nextInt();
			}
			Arrays.sort(velocidades);
			results.add(velocidades[n - 1]);
		}
		sc.close();

		for (int result : results) {
			if (result < 10)
				System.out.printf("1\n");
			else if (result < 20)
				System.out.printf("2\n");
			else
				System.out.printf("3\n");

		}

	}

}
