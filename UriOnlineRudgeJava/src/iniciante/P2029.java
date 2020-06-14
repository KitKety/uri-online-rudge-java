package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class P2029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> values = new ArrayList<Double>();
		sc.useLocale(Locale.US);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);

		while (sc.hasNext()) {
			values.add(sc.nextDouble());
		}
		sc.close();

		double area;
		for (int i = 0; i < values.size()-1; i += 2) {
			area = Math.pow((values.get(i + 1) / 2), 2) * 3.14;
			System.out.printf(
					"ALTURA = " + formatter.format(values.get(i) / area) + "\nAREA = " + formatter.format(area) + "\n");

		}

	}

}
