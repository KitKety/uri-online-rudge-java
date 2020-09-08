package strings;

import java.util.Scanner;

public class P1235 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < cases; i++) {
			String s = sc.nextLine();

			String left = s.substring(0, (s.length() / 2));
			String right = s.substring(s.length() / 2);

			StringBuffer sb = new StringBuffer(right + left);
			System.out.println(sb.reverse().toString());
		}
		sc.close();

	}

}
