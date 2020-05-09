package iniciante;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		sc.close();

		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
		symbols.setDecimalSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);

		switch (cod) {
		case 1:
			System.out.printf("Total: R$ " + formatter.format(qtd * 4) + "\n");
			break;
		case 2:
			System.out.printf("Total: R$ " + formatter.format(qtd * 4.5) + "\n");
			break;
		case 3:
			System.out.printf("Total: R$ " + formatter.format(qtd * 5) + "\n");
			break;
		case 4:
			System.out.printf("Total: R$ " + formatter.format(qtd * 2) + "\n");
			break;
		case 5:
			System.out.printf("Total: R$ " + formatter.format(qtd * 1.5) + "\n");
			break;
		}
	}

}
