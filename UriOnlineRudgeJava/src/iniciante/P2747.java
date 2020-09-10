package iniciante;

import java.io.IOException;

public class P2747 {

	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 39; i++) {
			System.out.print("-");
		}
		for (int a = 0; a < 5; a++) {
			System.out.printf("\n|");
			for (int i = 0; i < 37; i++) {
				System.out.print(" ");
			}
			System.out.printf("|");
		}
		System.out.println();
		for (int i = 0; i < 39; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
