package iniciante;

import java.util.Scanner;

public class P1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		sc.close();

		int ano = 0;
		while (d >= 365) {
			d -= 365;
			ano++;
		}
		int mes = 0;
		while (d >= 30) {
			d -= 30;
			mes++;
		}

		System.out.printf(ano + " ano(s)\n" + mes + " mes(es)\n" + d + " dia(s)\n");
	}

}
