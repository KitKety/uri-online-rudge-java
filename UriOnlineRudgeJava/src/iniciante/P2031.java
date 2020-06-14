package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P2031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<String> players = new ArrayList<String>();
		
		for (int i = 0; i < cases; i++) {
			players.add(sc.next());
			players.add(sc.next());
		}
		sc.close();

		for (int i = 0; i < players.size(); i += 2) {
			// player1 == player2
			if (players.get(i).equals(players.get(i + 1))) {
				if (players.get(i).equals("papel"))
					System.out.println("Ambos venceram");
				else if (players.get(i).equals("pedra"))
					System.out.println("Sem ganhador");
				else
					System.out.println("Aniquilacao mutua");

			}
			// player1 !== player2
			else if (players.get(i).equals("ataque"))
				System.out.println("Jogador 1 venceu");
			else if (players.get(i + 1).equals("ataque"))
				System.out.println("Jogador 2 venceu");
			else if (players.get(i).equals("pedra"))
				System.out.println("Jogador 1 venceu");
			else
				System.out.println("Jogador 2 venceu");
		}
	}
}
