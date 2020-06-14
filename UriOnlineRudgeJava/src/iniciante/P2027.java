package iniciante;

import java.util.Scanner;

public class P2027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		int T = sc.nextInt();
		int F = sc.nextInt();

		int hora = S + T + F;
		if (hora >= 24)
			hora -= 24;
		else if (hora < 0)
			hora += 24;

		System.out.println(hora);
	}

}
