package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P1958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		Double d = sc.nextDouble();
		sc.close();

		String s = String.format("%+.4E", d).replace(',', '.');
		System.out.printf(s + "\n");
	}

}
