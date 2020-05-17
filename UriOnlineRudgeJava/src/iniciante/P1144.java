package iniciante;

import java.util.Scanner;

public class P1144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int a = 0; a < 2; a++) {
				System.out.printf(i + " " + ((int) Math.pow(i, 2) + a) + " " + ((int) Math.pow(i, 3) + a) + "\n");
			}
		}
	}

}
