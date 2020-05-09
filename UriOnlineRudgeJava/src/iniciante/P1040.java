package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1040 {
	public static void main(String[] args) throws IOException {
		Locale locale = new Locale("US");
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		symbols.setGroupingSeparator('.');
		Scanner sc = new Scanner(System.in);
		sc.useLocale(locale);
		NumberFormat formatter = new DecimalFormat("#0.0", symbols);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();

		float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;

		String msg = ("Media: " + formatter.format(media) + "\n");
		if (media >= 7)
			System.out.printf(msg + "Aluno aprovado.\n");
		else if (media < 5)
			System.out.printf(msg + "Aluno reprovado.\n");
		else {
			float exame = sc.nextFloat();

			System.out.printf(msg + "Aluno em exame.\n");
			System.out.printf("Nota do exame: " + formatter.format(exame) + "\n");

			float media2 = (media + exame) / 2;

			if (media2 >= 5)
				System.out.printf("Aluno aprovado.\n");
			else
				System.out.printf("Aluno reprovado.\n");

			System.out.printf("Media final: " + formatter.format(media2) + "\n");

		}

		sc.close();
	}
}