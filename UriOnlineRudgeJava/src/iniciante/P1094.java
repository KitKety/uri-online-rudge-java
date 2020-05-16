package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class P1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		NumberFormat formatter = new DecimalFormat("#0.00 ", symbols);
		symbols.setDecimalSeparator('.');
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("C", 0);
		map.put("R", 0);
		map.put("S", 0);
		int cases = sc.nextInt();
		int number;
		String key;
		for (int i = 0; i < cases; i++) {
			number = sc.nextInt();
			key = sc.next();
			map.put(key, map.get(key) + number);
		}
		sc.close();

		int total = map.get("C") + map.get("R") + map.get("S");
		System.out.printf("Total: " + total + " cobaias\nTotal de coelhos: " + map.get("C") + "\nTotal de ratos: "
				+ map.get("R") + "\nTotal de sapos: " + map.get("S") + "\nPercentual de coelhos: "
				+ formatter.format((Float.valueOf(map.get("C")) / total) * 100) + "%%\nPercentual de ratos: "
				+ formatter.format((Float.valueOf(map.get("R")) / total) * 100) + "%%\nPercentual de sapos: "
				+ formatter.format((Float.valueOf(map.get("S")) / total) * 100) + "%%\n");

	}

}
