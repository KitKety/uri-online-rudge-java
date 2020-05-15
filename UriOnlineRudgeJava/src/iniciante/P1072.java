package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P1072 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] values = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = sc.nextInt();
		}
		sc.close();

		int in = 0;
		int out = 0;
		for (int value : values) {
			if (value >= 10 && value <= 20)
				in++;
			else
				out++;
		}

		System.out.printf(in + " in\n" + out + " out\n");
	}

}
