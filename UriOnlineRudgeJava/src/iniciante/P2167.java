package iniciante;

import java.util.Scanner;

public class P2167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int previous = 0;
		int atual;
		boolean print = false;
		for (int i = 0; i < cases; i++) {
			if (i == 0) {
				previous = sc.nextInt();
				i++;
			}
			atual = sc.nextInt();
			if (atual < previous) {
				System.out.println(i + 1);
				print = true;
				break;
			}
			previous = atual;
		}
		sc.close();
		if (!print)
			System.out.println(0);
	}

}
