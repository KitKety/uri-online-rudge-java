package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#.0", symbols);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();

		if ((a + b) > c && (a + c) > b && (c + b) > a)
			System.out.printf("Perimetro = " + formatter.format(a + b + c) + "\n");
		else
			System.out.printf("Area = " + formatter.format(((a + b) / 2.0) * c) + "\n");

	}
}
