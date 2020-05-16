package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class P1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];
		int cases = sc.nextInt();
		int[] results = new int[cases];
		for (int i = 0; i < cases; i++) {
			numbers[0] = sc.nextInt();
			numbers[1] = sc.nextInt();
			Arrays.sort(numbers);
			results[i] = 0;
			for (int n = (numbers[0] + 1); n < numbers[1]; n++) {
				if (n % 2 != 0)
					results[i] += n;
			}
		}
		sc.close();
		for (int result : results) {
			System.out.printf(result + "\n");
		}
	}

}
