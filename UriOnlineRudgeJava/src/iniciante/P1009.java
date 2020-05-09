package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);

		@SuppressWarnings("unused")
		String nome = sc.nextLine().trim();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		sc.close();

		System.out.printf("TOTAL = R$ " + formatter.format(salario + vendas * 0.15) + "\n");

	}

}
