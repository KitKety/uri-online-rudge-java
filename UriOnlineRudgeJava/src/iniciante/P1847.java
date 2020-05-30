package iniciante;

import java.util.Scanner;

public class P1847 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		sc.close();

		if (t1 > t2) {
			if ((t3 >= t2) || (t3 < t2 && (t2 - t3 < t1 - t2)))
				System.out.printf(":)\n");
			else
				System.out.printf(":(\n");

		} else if (t1 == t2) {
			if (t2 < t3)
				System.out.printf(":)\n");
			else
				System.out.printf(":(\n");

		} else if ((t3 <= t2) || (t3 > t2 && (t3 - t2 < t2 - t1)))
			System.out.printf(":(\n");
		else
			System.out.printf(":)\n");

	}

}
