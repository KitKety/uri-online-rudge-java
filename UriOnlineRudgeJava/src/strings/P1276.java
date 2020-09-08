package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class P1276 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words;
		int maxSize;
		String word;

		int n = sc.nextInt();
		while (n != 0) {
			words = new ArrayList<>();
			maxSize = 0;
			for (int i = 0; i < n; i++) {
				word = sc.next().trim();
				if (word.length() > maxSize) {
					maxSize = word.length();
				}
				words.add(word);
			}

			for (String s : words) {
				System.out.printf("%s\n", format(s, maxSize));
			}

			n = sc.nextInt();
			if (n != 0) {
				System.out.printf("\n");
			}
		}

		sc.close();
	}

	/**
	 * Justifica string recebida a direita
	 * 
	 * @param s        String a ser justificada
	 * @param maxChars tamanho maximo da linha
	 * @return String justificada
	 */
	public static String format(String s, int maxChars) {
		StringBuffer where = new StringBuffer();

		for (int i = 0; i < (maxChars - s.length()); i++) {
			where.append(' ');
		}

		where.append(s);
		return where.toString();
	}

}
