package iniciante;

import java.util.Scanner;

public class P2162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		int valid = 0;
		if (numbers.length < 3) {
			if (numbers.length == 1)
				System.out.printf("1\n");
			else if (numbers[0] == numbers[1])
				System.out.printf("0\n");
			else
				System.out.printf("1\n");

		} else {
			for (int i = 0; i < numbers.length - 2; i++) {
				if (numbers[i + 1] > numbers[i]) {
					if (numbers[i + 2] < numbers[i + 1])
						valid = 1;
					else {
						valid = 0;
						break;
					}
				} else {
					if (numbers[i + 2] > numbers[i + 1])
						valid = 1;
					else {
						valid = 0;
						break;
					}
				}
			}

			System.out.printf(valid + "\n");
		}
	}
}