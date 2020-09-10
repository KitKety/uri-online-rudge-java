package iniciante;

import java.util.Scanner;

public class P2708 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int cars = 0;
		int peoples = 0;

		while (!input.equals("ABEND")) {
			if (input.equals("SALIDA")) {
				peoples += sc.nextInt();
				cars++;
			} else {
				peoples -= sc.nextInt();
				cars--;
			}
			input = sc.next();
		}
		sc.close();

		System.out.printf("%d\n%d\n", peoples, cars);

	}

}
