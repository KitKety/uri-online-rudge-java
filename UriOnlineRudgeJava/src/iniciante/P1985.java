package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Scanner;

public class P1985 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> hm = new HashMap<String, Double>();
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#.00", symbols);
		int prod = sc.nextInt();
		for (int i = 0; i < prod; i++) {
			hm.put(sc.next(), sc.nextDouble());
		}
		sc.close();

		double valor=0;

		for (String key : hm.keySet()) {
			switch (key) {
			case "1001":
				valor += hm.get(key) * 1.5;
				break;
			case "1002":
				valor += hm.get(key) *2.5;
				break;
			case "1003":
				valor += hm.get(key) *3.5;
				break;
			case "1004":
				valor += hm.get(key) *4.5;
				break;
			default:
				valor += hm.get(key) * 5.50;
				break;
			}
		}
		
		System.out.printf(formatter.format(valor)+"\n");
	}

}
