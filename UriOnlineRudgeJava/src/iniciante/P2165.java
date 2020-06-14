package iniciante;

import java.util.Scanner;

public class P2165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();
		if (text.length() > 140)
			System.out.println("MUTE");
		else
			System.out.println("TWEET");
	}

}
