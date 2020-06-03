package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P1828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String[] partida = new String[2];
		ArrayList<String> results = new ArrayList<String>();

		for (int i = 0; i < cases; i++) {
			partida[0] = sc.next();
			partida[1] = sc.next();
			if (partida[0].equals("Spock") || partida[0].equals("lagarto")) {
				if (partida[1].equals("pedra") || partida[1].equals("tesoura")) {
					if (partida[0].equals("Spock"))
						results.add("Caso #" + (i + 1) + ": Bazinga!\n");
					else
						results.add("Caso #" + (i + 1) + ": Raj trapaceou!\n");
				} else if (partida[1].equals(partida[0]))
					results.add("Caso #" + (i + 1) + ": De novo!\n");
				else {
					if (partida[0].equals("Spock"))
						results.add("Caso #" + (i + 1) + ": Raj trapaceou!\n");
					else
						results.add("Caso #" + (i + 1) + ": Bazinga!\n");
				}
			} else if (partida[0].equals("tesoura") || partida[0].equals("pedra")) {
				if (partida[1].equals("papel") || partida[1].equals("lagarto")) {
					if (partida[0].equals("tesoura") || partida[0].equals("pedra") && partida[1].equals("lagarto"))
						results.add("Caso #" + (i + 1) + ": Bazinga!\n");
					else
						results.add("Caso #" + (i + 1) + ": Raj trapaceou!\n");
				} else if (partida[1].equals(partida[0]))
					results.add("Caso #" + (i + 1) + ": De novo!\n");
				else {
					if (partida[0].equals("pedra")) {
						if (partida[1].equals("tesoura"))
							results.add("Caso #" + (i + 1) + ": Bazinga!\n");
						else
							results.add("Caso #" + (i + 1) + ": Raj trapaceou!\n");
					} else
						results.add("Caso #" + (i + 1) + ": Raj trapaceou!\n");
				}
			} else {
				if (partida[1].equals("tesoura") || partida[1].equals("lagarto"))
					results.add("Caso #" + (i + 1) + ": Raj trapaceou!\n");
				else if (partida[1].equals(partida[0]))
					results.add("Caso #" + (i + 1) + ": De novo!\n");
				else
					results.add("Caso #" + (i + 1) + ": Bazinga!\n");

			}
		}
		sc.close();

		for (String result : results) {
			System.out.printf(result);
		}
	}

}
