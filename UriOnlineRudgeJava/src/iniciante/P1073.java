package iniciante;

import java.util.Scanner;

public class P1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 2; i <= n; i++) {
			System.out.printf(i + "^2 = " + (int)Math.pow(i, 2) + "\n");
			i++;
		}
	}

}
