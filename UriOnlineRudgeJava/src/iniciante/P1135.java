package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class P1135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];
		numbers[0] = sc.nextInt();
		numbers[1] = sc.nextInt();
		sc.close();
		Arrays.sort(numbers);
		int soma = 0;
		for (int i = numbers[0]; i <= numbers[1]; i++) {
			if (i % 13 != 0)
				soma += i;
		}
		System.out.printf(soma + "\n");
	}

}
