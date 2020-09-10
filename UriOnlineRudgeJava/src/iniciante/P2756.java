package iniciante;

public class P2756 {

	public static void main(String[] args) {
		for (char c = 'A'; c < 'F'; c++) {
			printLine(c);
		}
		for (char c = 'D'; c >= 'A'; c--) {
			printLine(c);
		}
	}

	private static void printLine(char c) {
		int value = Character.getNumericValue(c);
		pad(17 - value);
		System.out.print(c);

		if (value > 10) {
			value -= 10;
			value *= 2;
			pad(--value);
			System.out.println(c);
		} else {
			System.out.println();
		}
	}

	private static void pad(int spaces) {
		for (int i = 0; i < spaces; i++) {
			System.out.printf(" ");
		}
	}
}
