package iniciante;

import java.util.Scanner;

public class P2763 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cpf = (sc.next()).split("[\\.\\-]");
		sc.close();

		for (String piece : cpf) {
			System.out.println(piece);
		}

	}
}
