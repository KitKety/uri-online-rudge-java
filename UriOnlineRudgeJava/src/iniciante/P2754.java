package iniciante;

import java.util.Locale;

public class P2754 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a = 234.345;
		double b = 45.698;
		
		System.out.printf("%.6f - %.6f\n", a, b);
		System.out.printf("%.0f - %.0f\n", a, b);
		System.out.printf("%.1f - %.1f\n", a, b);
		System.out.printf(String.valueOf(a).substring(0,6) + " - %.2f\n",  b);
		System.out.printf("%.3f - %.3f\n", a, b);
		System.out.printf(String.format("%.6e - %.6e\n", a,b));
		System.out.printf(String.format("%.6E - %.6E\n", a,b));
		System.out.println(a + " - " + b);
		System.out.println(a + " - " + b);

	}

}
