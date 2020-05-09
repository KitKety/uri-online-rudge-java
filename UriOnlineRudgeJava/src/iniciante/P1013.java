package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class P1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		numbers[0] = sc.nextInt();
		numbers[1] = sc.nextInt();
		numbers[2] = sc.nextInt();
		sc.close();

		Arrays.sort(numbers);
		System.out.print(numbers[2] + " eh o maior\n");
	}

}
