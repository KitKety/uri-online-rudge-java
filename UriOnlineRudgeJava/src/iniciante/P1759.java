package iniciante;

import java.util.Scanner;

public class P1759 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			System.out.printf("Ho");
			if (i == n - 1)
				System.out.printf("!\n");
			else
				System.out.printf(" ");
		}
	}

}
