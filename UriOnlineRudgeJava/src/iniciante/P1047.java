package iniciante;

import java.io.IOException;
import java.util.Scanner; 

public class P1047 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();

		sc.close();

		int h = 24;
		int m = 0;

		if (h2 > h1)
			h = h2 - h1;
		else if (h1 > h2)
			h -= h1 - h2;

		if (m2 > m1) {
			m = m2 - m1;
			if (h2 == h1)
				h = 0;

		} else if (m1 > m2) {
			m = 60 - (m1 - m2);
			h--;
		}

		System.out.printf("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)\n");

	}

}
