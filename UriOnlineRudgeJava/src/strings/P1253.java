package strings;

import java.util.Scanner;

public class P1253 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {
			char[] str = sc.next().toCharArray();
			int cifra = sc.nextInt();
			for (int a = 0; a < str.length; a++) {
				System.out.printf("%s", (str[a] += cifra));
			}
		}
		
		sc.close();
	}

}
