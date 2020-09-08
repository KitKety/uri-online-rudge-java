package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class P1278 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words;
		int maxSize;
		String line;

		int n = Integer.parseInt(sc.nextLine().trim());
		while (n != 0) {
			words = new ArrayList<>();
			maxSize = 0;
			for (int i = 0; i < n; i++) {
				line = (sc.nextLine().trim()).replaceAll("\\s{2,}"," ");
				
				if (line.length() > maxSize) {
					maxSize = line.length();
				}
				words.add(line);
			}

			for (String s : words) {
				System.out.printf("%s\n", format(s, maxSize));
			}

			n = Integer.parseInt(sc.nextLine().trim());
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
