package strings;

import java.util.Scanner;

public class P1332 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String word;

		for (int i = 0; i < cases; i++) {
			word = sc.next();
			if (word.length() == 5) {
				System.out.printf("%d\n", 3);
			} else if (word.equals("owe") || word.equals("ote") || word.equals("ont") || word.equals("onw")) {
				/*
				 * palavras que podem ser interpretadas tando como 1 quanto como 2, mas sao
				 * consideradas 1 pela uri
				 */
				System.out.printf("%d\n", 1);
			} else if ((word.contains("t") && word.contains("w"))
					|| word.contains("t") && word.contains("o") && !word.contains("n")
					|| word.contains("w") && word.contains("o") && !word.contains("n")
					|| word.contains("t") && word.contains("o") && !word.contains("e")
					|| word.contains("w") && word.contains("o") && !word.contains("e")) {
				System.out.printf("%d\n", 2);
			} else {
				System.out.printf("%d\n", 1);
			}
		}

		sc.close();
	}

}
