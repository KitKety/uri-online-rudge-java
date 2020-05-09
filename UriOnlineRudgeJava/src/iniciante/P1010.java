package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);

		@SuppressWarnings("unused")
		int codigo = sc.nextInt();
		int num1 = sc.nextInt();
		float val1 = sc.nextFloat();
		codigo = sc.nextInt();
		int num2 = sc.nextInt();
		float val2 = sc.nextFloat();
		sc.close();

		System.out.printf("VALOR A PAGAR: R$ " + formatter.format(num1 * val1 + num2 * val2) + "\n");
	}

}
