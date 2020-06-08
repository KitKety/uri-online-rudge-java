package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class P1241 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> numbers = new ArrayList<String>();
		ArrayList<String> digits = new ArrayList<String>();
		
		int cases = sc.nextInt();
		
		for (int i = 0; i < cases; i++) {
			numbers.add(sc.next());
			digits.add(sc.next());
		}
		sc.close();

		for (String number : numbers) {
			if(!number.endsWith(digits.get(numbers.indexOf(number))))
				System.out.printf("nao ");
			System.out.printf("encaixa\n");
		}
	}

}
