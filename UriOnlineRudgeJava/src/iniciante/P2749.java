package iniciante;

public class P2749 {

	public static void main(String[] args) {
		trace();	
		System.out.printf("|x = 35");
		pad(31);
		System.out.printf("|\n|");
		pad(37);
		System.out.printf("|\n|");
		pad(15);
		System.out.printf("x = 35");
		pad(16);
		System.out.printf("|\n|");
		pad(37);
		System.out.printf("|\n|");
		pad(31);
		System.out.println("x = 35|");
		trace();
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
