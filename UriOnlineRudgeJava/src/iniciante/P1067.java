package iniciante;

import java.util.Scanner;

public class P1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			System.out.printf(i + "\n");
			i++;
		}
	}

}
