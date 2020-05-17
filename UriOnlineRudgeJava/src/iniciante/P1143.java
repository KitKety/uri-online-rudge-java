package iniciante;

import java.util.Scanner;

public class P1143 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i < n + 1; i++) {
			System.out.printf(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3) + "\n");
		}
	}
}
