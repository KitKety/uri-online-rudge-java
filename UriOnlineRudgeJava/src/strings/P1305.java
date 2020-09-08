package strings;

import java.util.Locale;
import java.util.Scanner;

public class P1305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		String wordSplitZero;
		String word;
		double cutOff;
		int integer;

		while (sc.hasNext()) {
			word = sc.nextLine().trim();
			wordSplitZero = word.split("\\.")[0];
			cutOff = Double.parseDouble(sc.nextLine().trim());

			if (wordSplitZero.length() == 0) {
				wordSplitZero = "0";
			}

			integer = Integer.parseInt(wordSplitZero);

			if (word.split("\\.").length > 1 && Double.parseDouble(("0." + word.split("\\.")[1])) > cutOff) {
				integer++;
			}

			System.out.println(integer);
		}

		sc.close();
	}

}
