package iniciante;

import java.io.IOException;
import java.util.Scanner; 

public class P1046 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		sc.close();

		int h = 24;
		
		if (h2 > h1)
			h = h2 - h1;
		else if (h1 > h2)
			h -= h1 - h2;

		System.out.printf("O JOGO DUROU " + h + " HORA(S)\n");

	}

}

