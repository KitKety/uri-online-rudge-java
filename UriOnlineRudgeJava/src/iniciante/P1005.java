package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00000", symbols);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();

		System.out.printf("MEDIA = " + formatter.format((a * 3.5 + b * 7.5) / 11) + "\n");

	}

}
