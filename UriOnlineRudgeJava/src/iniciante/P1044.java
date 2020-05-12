package iniciante;

import java.util.Scanner;

public class P1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (b % a == 0 || a % b == 0)
			System.out.printf("Sao Multiplos\n");
		else
			System.out.printf("Nao sao Multiplos\n");

	}

}
