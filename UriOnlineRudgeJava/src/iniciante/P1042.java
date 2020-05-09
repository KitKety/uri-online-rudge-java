package iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class P1042 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[3];
		numbers[0] = sc.nextInt();
		numbers[1] = sc.nextInt();
		numbers[2] = sc.nextInt();
		sc.close();

		int[] before = numbers.clone();

		Arrays.sort(numbers);
		for (int number : numbers) {
			System.out.printf(number + "\n");
		}

		System.out.printf("\n");

		for (int antique : before) {
			System.out.printf(antique + "\n");
		}

	}

}
