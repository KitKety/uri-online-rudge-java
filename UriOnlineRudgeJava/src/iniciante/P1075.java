package iniciante;

import java.io.IOException;
import java.util.Scanner; 

public class P1075 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (n < 3)
			System.out.printf("\n");
		else {
			for (int i = 1; i < 10000; i++) {
				if (i % n == 2) {
					System.out.printf(i + "\n");
				}
			}
		}

	}

}
