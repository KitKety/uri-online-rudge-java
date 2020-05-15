package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P1071 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		int result = 0;
		if (n1 != n2) {
			if (n1 < n2) {
				int aux = n1;
				n1 = n2;
				n2 = aux;
			}
			for (int i = n2 + 1; i < n1; i++) {
				if (i % 2 != 0)
					result = i + result;
			}
		}

		System.out.printf(result + "\n");

	}

}
