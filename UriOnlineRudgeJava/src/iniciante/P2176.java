package iniciante;

import java.util.Scanner;

public class P2176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		StringBuffer sb = new StringBuffer(s);

		int one = 0;
		while (true) {
			if (sb.indexOf("1") > -1) {
				sb.deleteCharAt(sb.indexOf("1"));
				one++;
			} else
				break;
		}

		System.out.printf(s);
		if (one % 2 == 0)
			System.out.printf("0\n");
		else
			System.out.printf("1\n");

	}

}
