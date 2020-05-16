package iniciante;

import java.util.Scanner;

public class P1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int a = 1; a < 4; a++) {
				System.out.printf((i * 4 + a) + " ");
			}
			System.out.printf("PUM\n");
		}
	}

}
