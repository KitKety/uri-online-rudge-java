package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double v = sc.nextDouble();
		sc.close();

		int cem = 0;
		int cinq = 0;
		int vinte = 0;
		int dez = 0;
		int cinco = 0;
		int dois = 0;
		int um = 0;
		int cinqC = 0;
		int vinteC = 0;
		int dezC = 0;
		int cincoC = 0;

		while (v >= 100) {
			v -= 100;
			cem++;
		}
		if (v >= 50) {
			v -= 50;
			cinq++;
		}
		while (v >= 20) {
			v -= 20;
			vinte++;
		}
		if (v >= 10) {
			v -= 10;
			dez++;
		}
		if (v >= 5) {
			v -= 5;
			cinco++;
		}
		while (v >= 2) {
			v -= 2;
			dois++;
		}
		if (v >= 1) {
			v -= 1;
			um++;
		}
		if (v >= 0.5) {
			v -= 0.5;
			cinqC++;
		}
		if (v >= 0.25) {
			v -= 0.25;
			vinteC++;
		}
		while (v >= 0.1) {
			v -= 0.1;
			dezC++;
		}
		if (v >= 0.05) {
			v -= 0.05;
			cincoC++;
		}

		System.out.printf("NOTAS:\n" + cem + " nota(s) de R$ 100.00\n" + cinq + " nota(s) de R$ 50.00\n" + vinte
				+ " nota(s) de R$ 20.00\n" + dez + " nota(s) de R$ 10.00\n" + cinco + " nota(s) de R$ 5.00\n" + dois
				+ " nota(s) de R$ 2.00\n" + "MOEDAS:\n" + um + " moeda(s) de R$ 1.00\n" + cinqC
				+ " moeda(s) de R$ 0.50\n" + vinteC + " moeda(s) de R$ 0.25\n" + dezC + " moeda(s) de R$ 0.10\n"
				+ cincoC + " moeda(s) de R$ 0.05\n" + Math.round((v * 100)) + " moeda(s) de R$ 0.01\n");
	}

}
