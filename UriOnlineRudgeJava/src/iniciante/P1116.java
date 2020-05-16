package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class P1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		NumberFormat formatter = new DecimalFormat("#0.0", symbols);
		symbols.setDecimalSeparator('.');
		int cases = sc.nextInt();
		int x;
		int y;
		ArrayList<String> results = new ArrayList<String>();
		for (int i = 0; i < cases; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (y != 0)
				results.add(formatter.format((float) x / y) + "\n");
			else
				results.add("divisao impossivel\n");
		}
		sc.close();
		for (String result : results) {
			System.out.printf(result);
		}

	}

}
