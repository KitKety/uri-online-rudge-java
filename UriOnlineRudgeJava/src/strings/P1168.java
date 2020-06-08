package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class P1168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<char[]> numbers = new ArrayList<char[]>();
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {
			numbers.add(sc.next().toCharArray());
		}
		sc.close();
		int leds = 0;
		for (char[] number : numbers) {
			leds = 0;
			for (char n : number) {
				if (n == '1')
					leds += 2;
				else if (n == '2' || n == '3' || n == '5')
					leds += 5;
				else if (n == '4')
					leds += 4;
				else if (n == '6' || n == '9' || n == '0')
					leds += 6;
				else if (n == '7')
					leds += 3;
				else
					leds += 7;
			}

			System.out.printf(leds + " leds\n");
		}
	}

}
