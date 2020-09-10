package iniciante;

public class P2748 {

	public static void main(String[] args) {
		String[] vars = { "Roberto", "5786", "UNIFEI" };

		trace();

		for (String var : vars) {
			System.out.printf("|");
			pad(8);
			System.out.print(var);
			pad(29 - var.length());
			System.out.printf("|\n");

			if (!var.equals("UNIFEI")) {
				System.out.print("|");
				pad(37);
				System.out.print("|\n");
			}

		}

		trace();
	}

	private static void pad(int spaces) {
		for (int i = 0; i < spaces; i++) {
			System.out.print(" ");
		}
	}

	private static void trace() {
		for (int i = 0; i < 39; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
