package iniciante;

import java.util.Scanner;

public class P2791 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 1;
		while (true) {
			if (sc.nextInt() == 1) {
				System.out.println(cont);
				break;
			}
			cont++;
		}
		sc.close();
	}

}
