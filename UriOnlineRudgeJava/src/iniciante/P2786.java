package iniciante;

import java.util.Scanner;

public class P2786 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		System.out.println((c + (c - 1)) * l - (c - 1));
		System.out.println((c - 1) * 2 + (l - 1) * 2);
	}

}
