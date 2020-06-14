package iniciante;

import java.util.Scanner;

public class P2061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int init = sc.nextInt();
		int actions = sc.nextInt();

		for (int i = 0; i < actions; i++) {
			if (sc.next().equals("fechou"))
				init ++;
			else
				init--;
		}
		sc.close();
		System.out.printf(init + "\n");

	}

}
