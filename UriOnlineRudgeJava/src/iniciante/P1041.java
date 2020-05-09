package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		sc.close();

		if (x == 0 && y == 0)
			System.out.printf("Origem\n");
		else {
			if (x == 0)
				System.out.printf("Eixo Y\n");
			else if (y == 0)
				System.out.printf("Eixo X\n");
			else {
				if (x > 0) {
					if (y > 0)
						System.out.printf("Q1\n");
					else
						System.out.printf("Q4\n");
				} else {
					if (y > 0)
						System.out.printf("Q2\n");
					else
						System.out.printf("Q3\n");
				}

			}
		}
	}

}
