package iniciante;

import java.util.Scanner;

public class P2160 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		if (texto.length() > 80)
			System.out.println("NO");
		else
			System.out.println("YES");
		sc.close();
	}

}
