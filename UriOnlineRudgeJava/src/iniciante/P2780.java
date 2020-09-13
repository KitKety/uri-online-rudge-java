package iniciante;

import java.util.Scanner;

public class P2780 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		sc.close();

		if (distance > 1400) {
			System.out.println(3);
		} else if (distance > 800) {
			System.out.println(2);
		} else {
			System.out.println(1);
		}
	}

}
