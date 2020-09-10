package iniciante;

public class P2750 {

	public static void main(String[] args) {
		trace();
		System.out.println("|  decimal  |  octal  |  Hexadecimal  |");
		trace();

		for (int i = 0; i < 16; i++) {
			System.out.printf("|");
			dec(i);
			oct(i);
			hex(i);
		}

		trace();
	}

	private static void dec(int i) {
		pad(i > 9 ? 5 : 6);
		System.out.printf("%d", i);
		pad(4);
		System.out.printf("|");
	}

	private static void oct(int i) {
		pad(i > 7 ? 3 : 4);
		System.out.printf(Integer.toOctalString(i));
		pad(4);
		System.out.printf("|");
	}

	private static void hex(int i) {
		pad(7);
		System.out.printf(Integer.toHexString(i).toUpperCase());
		pad(7);
		System.out.println("|");
	}

	private static void trace() {
		for (int i = 0; i < 39; i++) {
			System.out.printf("-");
		}
		System.out.printf("\n");
	}

	private static void pad(int spaces) {
		for (int i = 0; i < spaces; i++) {
			System.out.printf(" ");
		}
	}

}
