package iniciante;

import java.util.Scanner;

public class P1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		System.out.printf("DIFERENCA = %d\n", (a * b - c * d));

	}

}
