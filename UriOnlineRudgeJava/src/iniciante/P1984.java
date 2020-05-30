package iniciante;

import java.util.Scanner;

public class P1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sb.append(sc.nextLong());
		sc.close();

		System.out.printf(sb.reverse() + "\n");
	}

}
