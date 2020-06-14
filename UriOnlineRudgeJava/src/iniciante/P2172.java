package iniciante;

import java.util.Scanner;

public class P2172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mult = sc.nextInt();
		long xp = sc.nextLong();
		while (xp != 0 && mult != 0) {
			System.out.println(mult * xp);
			mult = sc.nextInt();
			xp = sc.nextLong();
		}
		sc.close();
	}

}
