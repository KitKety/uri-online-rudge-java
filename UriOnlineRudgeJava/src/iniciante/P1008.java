package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);

		int numero = sc.nextInt();
		int horas = sc.nextInt();
		float salario = sc.nextFloat();
		sc.close();

		System.out.printf("NUMBER = %d\n", numero);
		System.out.printf("SALARY = U$ " + formatter.format(horas * salario) + "\n");
	}

}
