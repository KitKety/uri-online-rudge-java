package iniciante;

import java.util.Scanner;

public class P1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares = 0;
		for (int i = 0; i < 5; i++) {
			if (sc.nextInt() % 2 == 0)
				pares++;
		}
		sc.close();
		System.out.printf(pares + " valores pares\n");
	}

}
