package iniciante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1133 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];
		numbers[0] = sc.nextInt();
		numbers[1] = sc.nextInt();
		sc.close();
		Arrays.sort(numbers);
		ArrayList<String> results = new ArrayList<String>();
		for (int i = (numbers[0] + 1); i < numbers[1]; i++) {
			if (i % 5 == 2 || i % 5 == 3)
				results.add(i + "\n");
		}
		for (String result : results) {
			System.out.printf(result);
		}
	}

}
