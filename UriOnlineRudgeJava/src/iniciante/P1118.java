package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class P1118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);
		symbols.setDecimalSeparator('.');
		ArrayList<String> results = new ArrayList<String>();
		float nota;
		int repetir;
		float notas;
		do {
			notas = 0;
			for (int i = 0; i < 2; i++) {
				do {
					nota = sc.nextFloat();
					if ((nota < 0 || nota > 10))
						results.add("nota invalida\n");
				} while ((nota < 0 || nota > 10));
				notas += nota;
			}
			results.add("media = " + formatter.format(notas / 2.0) + "\n");
			do {
				results.add("novo calculo (1-sim 2-nao)\n");
				repetir = sc.nextInt();
			} while (repetir < 1 || repetir > 2);
		} while (repetir == 1);

		sc.close();

		for (String result : results) {
			System.out.printf(result);
		}
	}

}
