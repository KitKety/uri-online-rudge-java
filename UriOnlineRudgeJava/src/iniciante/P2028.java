
package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P2028 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb;
		int cont = 0;
		int cases = 0;
		int n;

		while (sc.hasNext()) {
			cases++;
			cont = 0;
			n = sc.nextInt();
			sb = new StringBuilder();
			for (int i = 0; i <= n; i++) {
				sb.append(i + " ");
				cont++;
				for (int a = 0; a < (i - 1); a++) {
					sb.append(i + " ");
					cont++;
				}
			}

			System.out.printf("Caso %d: %d %s\n%s\n\n", cases, cont, (cont > 1 ? "numeros" : "numero"),
					sb.toString().trim());
		}

		sc.close();

	}

}
