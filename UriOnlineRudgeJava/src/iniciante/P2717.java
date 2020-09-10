package iniciante;

import java.util.Scanner;

public class P2717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int timeLimit = sc.nextInt();
		if (sc.nextInt() + sc.nextInt() > timeLimit) {
			System.out.println("Deixa para amanha!");
		} else {
			System.out.println("Farei hoje!");
		}
		sc.close();
	}

}
