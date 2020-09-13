package iniciante;

import java.util.Scanner;

public class P2759 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char first = sc.next().charAt(0);
		char second = sc.next().charAt(0);
		char thrid = sc.next().charAt(0);

		sc.close();

		System.out.printf("A = %c, B = %c, C = %c\n", first, second, thrid);
		System.out.printf("A = %c, B = %c, C = %c\n", second, thrid, first);
		System.out.printf("A = %c, B = %c, C = %c\n", thrid, first, second);
	}

}
