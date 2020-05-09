package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		double n = sc.nextDouble();
		sc.close();

		if (n < 0 || n > 100)
			System.out.printf("Fora de intervalo\n");
		else {

			if (n <= 25)
				System.out.printf("Intervalo [0,25]\n");
			else if (n <= 50)
				System.out.printf("Intervalo (25,50]\n");
			else if (n <= 75)
				System.out.printf("Intervalo (50,75]\n");
			else
				System.out.printf("Intervalo (75,100]\n");

		}

	}

}
