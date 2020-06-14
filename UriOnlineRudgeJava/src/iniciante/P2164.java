package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Scanner;

public class P2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.0", symbols);

		int n = sc.nextInt();
		sc.close();

		System.out.println(formatter.format(
				(Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5)));

	}

}
