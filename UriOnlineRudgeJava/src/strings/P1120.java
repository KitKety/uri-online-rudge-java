package strings;

import java.util.Scanner;

public class P1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String digit = sc.next();
		StringBuffer value = new StringBuffer(sc.next());

		while (!digit.equals("0") && !value.toString().equals("0")) {
			value = new StringBuffer(value.toString().replaceAll(digit, ""));

			if (value.toString().length() > 0 && !value.toString().equals("0")) {
				StringBuffer result = new StringBuffer();
				boolean append = false;
				for (char c : value.toString().toCharArray()) {
					if (c != '0' || append) {
						result.append(c);
						append = true;
					}
				}

				System.out.println(result.toString().equals("") ? "0" : result.toString());

			} else {
				System.out.println("0");
			}

			digit = sc.next();
			value = new StringBuffer(sc.next());
		}

		sc.close();
	}

}
