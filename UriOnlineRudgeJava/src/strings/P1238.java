package strings;

import java.util.Scanner;

public class P1238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {
			String first = sc.next();
			String second = sc.next();

			int lenght = first.length();
			if (second.length() > lenght) {
				lenght = second.length();
			}
			
			for (int a = 0; a < lenght; a++) {
				if (first.length() > a) {
					System.out.print(first.charAt(a));
				}
				if (second.length() > a) {
					System.out.print(second.charAt(a));
				}
			}

			System.out.println();
		}

		sc.close();
	}

}
