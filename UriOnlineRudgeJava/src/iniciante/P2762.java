package iniciante;

import java.util.Scanner;

public class P2762 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("\\.");
		sc.close();
		System.out.println(Integer.parseInt(s[1]) + "." + Integer.parseInt(s[0]));
	}

}
