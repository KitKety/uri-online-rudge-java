package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class P1098 {

	public static void main(String[] args) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		NumberFormat formatter = new DecimalFormat("0.#", symbols);
		symbols.setDecimalSeparator('.');
		for (float i = 0; i < 2.2; i+=0.2) {
			for (int x = 0; x < 3; x++) {
				System.out.printf("I=" + formatter.format(i) + " J=" + formatter.format((x+1+i)) + "\n");
			}
		}
	}

}
