package iniciante;

import java.util.Scanner;

public class P1837 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int q = (int) a / b;
		int r = a % b;

		if (a < 0 && r < 0 && b > 0)
			q--;
		else if (a < 0 && r != 0) {
			q = (q < 0) ? q + 1 : q - 1;
			if (b < 0)
				q += 2;
		}

		System.out.printf(q + " " + (a - b * q) + "\n");
	}

}
