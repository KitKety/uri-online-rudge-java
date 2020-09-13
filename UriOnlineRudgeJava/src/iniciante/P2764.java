package iniciante;

import java.util.Scanner;

public class P2764 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] date = sc.next().split("\\/");
		sc.close();

		System.out.println(date[1] + "/" + date[0] + "/" + date[2]);
		System.out.println(date[2] + "/" + date[1] + "/" + date[0]);
		System.out.println(date[0] + "-" + date[1] + "-" + date[2]);
	}

}
