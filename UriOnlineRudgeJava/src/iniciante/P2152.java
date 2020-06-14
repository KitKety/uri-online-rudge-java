package iniciante;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class P2152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> logs = new ArrayList<String>();
		NumberFormat formatter = new DecimalFormat("00");

		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			logs.add(formatter.format(sc.nextInt()) + ":" + formatter.format(sc.nextInt())
					+ (sc.nextInt() == 0 ? " - A porta fechou!" : " - A porta abriu!"));
		}
		sc.close();
		for (String log : logs) {
			System.out.println(log);
		}
	}

}
