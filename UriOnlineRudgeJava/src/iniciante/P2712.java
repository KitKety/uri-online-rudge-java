package iniciante;

import java.util.Scanner;

public class P2712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {
			String licencePlate = sc.next();
			if (!valid(licencePlate)) {
				System.out.println("FAILURE");
			} else {
				String digit = licencePlate.substring(licencePlate.length() - 1);
				if (digit.equals("1") || digit.equals("2")) {
					System.out.println("MONDAY");
				} else if (digit.equals("3") || digit.equals("4")) {
					System.out.println("TUESDAY");
				} else if (digit.equals("5") || digit.equals("6")) {
					System.out.println("WEDNESDAY");
				} else if (digit.equals("7") || digit.equals("8")) {
					System.out.println("THURSDAY");
				} else {
					System.out.println("FRIDAY");
				}
			}
		}

		sc.close();
	}

	private static boolean valid(String licencePlate) {
		if (licencePlate.length() != 8)
			return false;
		if (licencePlate.indexOf('-') != 3)
			return false;
		String letters = licencePlate.substring(0, 3);
		for (char c : letters.toCharArray()) {
			if (Character.isLowerCase(c) || !Character.isLetter(c)) {
				return false;
			}
		}

		String numbers = licencePlate.substring(4);
		for (char c : numbers.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		return true;
	}

}
