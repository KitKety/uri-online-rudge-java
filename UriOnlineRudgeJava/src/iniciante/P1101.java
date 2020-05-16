package iniciante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];
		ArrayList<String> results = new ArrayList<String>();
		String resposta;
		int soma;
		do {
			resposta = "";
			numbers[0] = sc.nextInt();
			numbers[1] = sc.nextInt();
			soma = 0;
			Arrays.sort(numbers);
			if (numbers[0] > 0 && numbers[1] > 0) {
				for (int i = numbers[0]; i <= numbers[1]; i++) {
					resposta += (i + " ");
					soma += i;
				}
				resposta += ("Sum=" + soma);
				results.add(resposta);
			}
		} while (numbers[0] > 0 && numbers[1] > 0);
		sc.close();
		for (String result : results) {
			System.out.printf(result + "\n");
		}
	}

}
