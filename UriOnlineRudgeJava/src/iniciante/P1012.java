package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.000", symbols);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();

		System.out.printf("TRIANGULO: " + formatter.format(a * c / 2) + "\nCIRCULO: "
				+ formatter.format(3.14159 * c * c) + "\nTRAPEZIO: " + formatter.format((a + b) * c / 2)
				+ "\nQUADRADO: " + formatter.format(b * b) + "\nRETANGULO: " + formatter.format(a * b) + "\n");

	}

}
