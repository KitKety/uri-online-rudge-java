package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1;
		int v2;
		ArrayList<String> results = new ArrayList<String>();
		do {
			v1 = sc.nextInt();
			v2 = sc.nextInt();
			if (v1 != v2) {
				if (v1 > v2)
					results.add("Decrescente");
				else
					results.add("Crescente");
			}
		} while (v1 != v2);
		sc.close();
		for (String result : results) {
			System.out.printf(result + "\n");
		}
	}

}
