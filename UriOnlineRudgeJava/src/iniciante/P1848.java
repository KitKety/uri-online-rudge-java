package iniciante;

import java.util.Scanner;

public class P1848 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		StringBuffer line = new StringBuffer();
		int gritos = 0;
		
		do {
			line.replace(0, line.length(), sc.nextLine());
			if (line.toString().contains("caw"))
				gritos++;
			else
				numbers[gritos] += Integer.parseInt((line.toString().replaceAll("-", "0").replaceAll("\\*", "1")), 2);

		} while (gritos < 3);
		sc.close();
		
		for (int number : numbers) {
			System.out.printf(number + "\n");
		}
	}

}
