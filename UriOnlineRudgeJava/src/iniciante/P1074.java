package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P1074 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] values = new int[n];

		String msg = "";
		for (int i = 0; i < n; i++) {
			values[i] = sc.nextInt();
		}
		sc.close();
		for (int value : values) {
			if (value == 0)
				msg = "NULL";
			else {
				if (value % 2 == 0)
					msg = "EVEN";
				else
					msg = "ODD";

				if (value > 0)
					msg += " POSITIVE";
				else
					msg += " NEGATIVE";

			}
			
			System.out.printf(msg + "\n");
		}

	}

}
