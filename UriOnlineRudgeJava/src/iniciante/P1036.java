package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00000", symbols);

		double a = sc.nextDouble() * 2;
		double b = sc.nextDouble() * -1;
		double c = sc.nextDouble();
		sc.close();

		if (a == 0 || b == 0 || 2 * a * c > Math.pow(b, 2))
			System.out.printf("Impossivel calcular\n");
		else {
			double r = Math.sqrt(Math.pow(b, 2) - 2 * a * c);
			System.out
					.printf("R1 = " + formatter.format((b + r) / a) + "\nR2 = " + formatter.format((b - r) / a) + "\n");
		}
	}

}
