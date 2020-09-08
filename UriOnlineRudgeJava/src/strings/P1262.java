package strings;

import java.util.Scanner;

public class P1262 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String process = sc.next();
			int cicle = sc.nextInt();
			char previous = '0';
			int group = 1;
			int total = 0;

			for (char c : process.toCharArray()) {
				if (c == 'W') {
					total++;
				} else if (c == previous && group < cicle) {
					group++;
				} else {
					if (group > cicle) {
						total += Math.round(group / cicle);
					} else {
						total++;
					}
					group = 1;
				}

				previous = c;
			}

			System.out.println(total);

		}
		sc.close();

	}

}
