package iniciante;

import java.util.Scanner;

public class P1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i < 11; i++) {
			System.out.printf(i + " x " + n + " = " + n * i + "\n");
		}
	}

}
