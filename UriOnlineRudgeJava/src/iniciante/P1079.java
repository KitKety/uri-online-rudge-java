package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class P1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		NumberFormat formatter = new DecimalFormat("#0.0\n", symbols);
		symbols.setDecimalSeparator('.');
		ArrayList<String> results = new ArrayList<String>();

		int cases = sc.nextInt();
		float media = 0;
		
		for (int i = 0; i < cases; i++) {
			media = 0;
			media += sc.nextFloat() * 2;
			media += sc.nextFloat() * 3;
			media += sc.nextFloat() * 5;
			results.add(formatter.format(media / 10.0));
		}
		sc.close();
		
		for(String result:results) {
			System.out.printf(result);
		}
	}

}
