package iniciante;

import java.util.Scanner;

public class P2685 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int value = sc.nextInt();
			if (value < 90 || value == 360) {
				System.out.println("Bom Dia!!");
			} else if (value < 180) {
				System.out.println("Boa Tarde!!");
			} else if (value < 270) {
				System.out.println("Boa Noite!!");
			} else {
				System.out.println("De Madrugada!!");
			}
		}

		sc.close();
	}

}
