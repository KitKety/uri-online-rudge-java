package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1051 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		symbols.setGroupingSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);
		float salary = sc.nextFloat();
		sc.close();

		String imposto;
		float somatoria = 0;
		if (salary > 2000) {
			float valid = salary - 2000;
			float diference = salary - 3000;
			if (diference > 0)
				valid -= diference;
			somatoria += valid * 0.08;

			if (salary > 3000) {
				valid = salary - 3000;
				diference = salary - 4500;
				if (diference > 0)
					valid -= diference;
				somatoria += valid * 0.18;

			}
			if (salary > 4500) {
				valid = salary - 4500;
				somatoria += valid * 0.28;
			}

			imposto = "R$ " + formatter.format(somatoria);
		} else
			imposto = "Isento";

		System.out.printf(imposto + "\n");
	}

}
