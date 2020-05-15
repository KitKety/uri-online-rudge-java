package iniciante;

import java.util.Scanner;

public class P1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (n % 2 == 0)
			n++;

		for (int i = 0; i < 6 * 2; i++) {
			System.out.printf((n + i) + "\n");
			i++;
		}
	}

}
