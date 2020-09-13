package iniciante;

import java.util.Scanner;

public class P2787 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int columns = sc.nextInt();
		sc.close();

		if ((lines % 2 == 0 && columns % 2 == 0) || (lines % 2 == 1 && columns % 2 == 1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
