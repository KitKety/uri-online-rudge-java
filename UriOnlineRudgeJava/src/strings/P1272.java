package strings;

import java.util.Scanner;

public class P1272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < cases; i++) {
			String line = (sc.nextLine().trim()).replaceAll("\\s{2,}", " ");
			for (String word : line.split(" ")) {
				if (word.length() > 0)
					System.out.printf("%s", word.charAt(0));
			}
			System.out.printf("\n");
		}
		sc.close();
	}

}
