package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class P1006 {
	public static void main(String[] args) throws Exception, IOException {
		DecimalFormat df = new DecimalFormat("#0.0", new DecimalFormatSymbols(Locale.ENGLISH));
		Scanner sc = new Scanner(System.in);
		sc.useLocale(new Locale("US"));
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		sc.close();
		
		double media = (n1*2 + n2*3 + n3*5) / 10;
		
		System.out.printf("MEDIA = " + df.format(media) + "\n");

	}
}
