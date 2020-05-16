package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> results = new ArrayList<String>();
		boolean loop = true;
		do {
			if (sc.nextInt() != 2002)
				results.add("Senha Invalida");
			else {
				results.add("Acesso Permitido");
				loop = false;
			}
		} while (loop);
		sc.close();
		for (String result : results) {
			System.out.printf(result + "\n");
		}
	}

}
