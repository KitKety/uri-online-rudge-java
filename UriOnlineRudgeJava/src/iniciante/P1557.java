package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P1557 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int n = sc.nextInt();
		while (n > 0) {
			numbers.add(n);
			n = sc.nextInt();
		}
		sc.close();

		n = 1;
		int[] values = null;
		int spaces;

		for (int number : numbers) {

			values = new int[number];
			for (int i = 1; i <= number; i++) {
				if (i > 2)
					n *= 2;
				else
					n = i;
				values[i - 1] = n;
			}

			for (int value : values) {

				for (int i = 0; i < number; i++) {
					if (i > 0)
						value *= 2;

					spaces = (String.valueOf((int) Math.pow(values[number - 1], 2)).length())
							- (String.valueOf(value).length()) + 1;
					if (i == 0)
						spaces--;

					for (int s = 0; s < spaces; s++) {
						System.out.printf(" ");
					}

					System.out.printf("%d", value);

					if (i == number - 1)
						System.out.printf("\n");

				}
			}

			System.out.printf("\n");

		}

	}

}
