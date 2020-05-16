package iniciante;

import java.util.Scanner;

public class P1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comb;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		do {
			comb = sc.nextInt();
			switch (comb) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
		} while (comb != 4);
		sc.close();
		System.out
				.printf("MUITO OBRIGADO\nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel + "\n");
	}

}
