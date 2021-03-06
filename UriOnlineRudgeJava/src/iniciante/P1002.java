package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.0000", symbols);

		double raio = sc.nextDouble();
		sc.close();

		double area = 3.14159 * raio * raio;
		System.out.printf("A=" + formatter.format(area) + "\n");

	}

}
