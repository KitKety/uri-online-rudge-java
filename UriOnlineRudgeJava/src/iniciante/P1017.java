package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.000", symbols);

		int tempo = sc.nextInt();
		int v = sc.nextInt();
		sc.close();

		System.out.printf(formatter.format((tempo * v) / 12.0) + "\n");
	}

}
