package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1048 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale locale = new Locale("US");
		sc.useLocale(locale);
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator('.');
		symbols.setGroupingSeparator('.');
		NumberFormat formatter = new DecimalFormat("#0.00", symbols);

		double salary = sc.nextDouble();
		sc.close();

		double novoSal;
		String percent;

		if (salary <= 400) {
			novoSal = salary + salary * 0.15;
			percent = "15";
		} else if (salary <= 800) {
			novoSal = salary + salary * 0.12;
			percent = "12";
		} else if (salary <= 1200.00) {
			novoSal = salary + salary * 0.1;
			percent = "10";
		} else if (salary <= 2000.00) {
			novoSal = salary + salary * 0.07;
			percent = "7";
		} else {
			novoSal = salary + salary * 0.04;
			percent = "4";
		}
		double reajuste = novoSal - salary;

		System.out.printf("Novo salario: " + formatter.format(novoSal) + "\n");
		System.out.printf("Reajuste ganho: " + formatter.format(reajuste) + "\n");
		System.out.printf("Em percentual: " + percent + " %%\n");
	}

}
