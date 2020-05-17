package iniciante;

import java.util.Scanner;

public class P1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt() + 1;
		sc.close();
		for (int i = 1; i < y; i++) {
			System.out.printf("%d", i);
			if (i % x == 0)
				System.out.printf("\n");
			else
				System.out.printf(" ");
		}
	}

}
