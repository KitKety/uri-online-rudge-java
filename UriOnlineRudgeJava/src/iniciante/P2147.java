package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class P2147 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		sc.useLocale(Locale.US);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);

		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			words.add(sc.next());
		}
		sc.close();

		for (String word : words) {
			System.out.println(formatter.format((word.split("e").length + 7) * 0.01));
		}
	}

}
