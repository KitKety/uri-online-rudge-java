package iniciante;

import java.util.Scanner;

public class P1052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		String[] meses = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		System.out.printf(meses[n - 1] + "\n");
	}

}
