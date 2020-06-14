package iniciante;

import java.util.Scanner;

public class P2060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int multiplos5 = 0;
		int multiplos4 = 0;
		int multiplos3 = 0;
		int multiplos2 = 0;
		int numero;

		for (int i = 0; i < N; i++) {
			numero = sc.nextInt();
			if (numero % 5 == 0)
				multiplos5++;
			if (numero % 4 == 0)
				multiplos4++;
			if (numero % 3 == 0)
				multiplos3++;
			if (numero % 2 == 0)
				multiplos2++;
		}

		System.out.println(multiplos2 + " Multiplo(s) de 2");
		System.out.println(multiplos3 + " Multiplo(s) de 3");
		System.out.println(multiplos4 + " Multiplo(s) de 4");
		System.out.println(multiplos5 + " Multiplo(s) de 5");
	}

}
