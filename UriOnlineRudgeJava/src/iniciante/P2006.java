package iniciante;

import java.util.Scanner;

public class P2006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo = sc.nextInt();
		int acertos = 0;
		for (int i = 0; i < 5; i++) {
			if (sc.nextInt() == tipo)
				acertos++;
		}
		sc.close();
		System.out.printf(acertos + "\n");
	}

}
