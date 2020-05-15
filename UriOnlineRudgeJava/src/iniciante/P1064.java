package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1064 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.0", symbols);
		
		int positivos = 0;
		float aux;
		float media=0;
		for (int i = 0; i < 6; i++) {
			aux = sc.nextFloat();
			if (aux > 0) {
				positivos++;
				media += aux;
			}
		}
		sc.close();
		System.out.printf(positivos + " valores positivos\n");
		System.out.printf(formatter.format(media/positivos) + "\n");

	}
}