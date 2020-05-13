package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class P1045 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(new Locale("US"));
		double A = 0, B = 0, C = 0;

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		sc.close();

		double maior = comparaValores(a, b);
		A = comparaValores(maior, c);

		if (a == A) {
			B = comparaValores(c, b);
			C = (b == B ? c : b);
		} else if (b == A) {
			B = comparaValores(a, c);
			C = (a == B ? c : a);
		} else if (c == A) {
			B = comparaValores(b, a);
			C = (a == B ? b : a);
		}

		if (A >= (B + C))
			System.out.printf("NAO FORMA TRIANGULO\n");
		else if (A * A == B * B + C * C)
			System.out.printf("TRIANGULO RETANGULO\n");
		else {

			if (A * A > B * B + C * C)
				System.out.printf("TRIANGULO OBTUSANGULO\n");

			if (A * A < B * B + C * C)
				System.out.printf("TRIANGULO ACUTANGULO\n");

			if (A == B && B == C)
				System.out.printf("TRIANGULO EQUILATERO\n");
			else if (A == B && B != C || B == C && C != A || C == A && B != C)
				System.out.printf("TRIANGULO ISOSCELES\n");

		}
	}

	public static double comparaValores(double v1, double v2) {
		double maior = v1;
		if (maior < v2) {
			return v2;
		}
		return v1;
	}

}
