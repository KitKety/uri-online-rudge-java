package iniciante;

import java.util.Scanner;

public class P2765 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] phrase = sc.nextLine().split(",");
		sc.close();

		for (String piece : phrase) {
			System.out.println(piece);
		}
	}

}
