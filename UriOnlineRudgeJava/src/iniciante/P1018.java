package iniciante;

import java.util.Scanner;

public class P1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		sc.close();

		System.out.printf(v + "\n");
		int cem = 0;
		int cinq = 0;
		int vinte = 0;
		int dez = 0;
		int cinco = 0;
		int dois = 0;
		int um = 0;

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
		if (v == 1)
			um++;

		System.out.printf(cem + " nota(s) de R$ 100,00\n" + cinq + " nota(s) de R$ 50,00\n" + vinte
				+ " nota(s) de R$ 20,00\n" + dez + " nota(s) de R$ 10,00\n" + cinco + " nota(s) de R$ 5,00\n" + dois
				+ " nota(s) de R$ 2,00\n" + um + " nota(s) de R$ 1,00\n");
	}

}
