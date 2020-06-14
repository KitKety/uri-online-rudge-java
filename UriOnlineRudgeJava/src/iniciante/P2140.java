package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P2140 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> difs = new ArrayList<Integer>();
		int val = sc.nextInt();
		int pg = sc.nextInt();

		while (val != 0 && pg != 0) {
			difs.add(pg - val);
			val = sc.nextInt();
			pg = sc.nextInt();
		}
		sc.close();

		for (Integer dif : difs) {
			if (dif == 4 || dif == 7 || dif == 12 || dif == 22 || dif == 52 || dif == 102 || dif == 10 || dif == 15
					|| dif == 25 || dif == 55 || dif == 105 || dif == 20 || dif == 30 || dif == 60 || dif == 110
					|| dif == 40 || dif == 70 || dif == 120 || dif == 100 || dif == 150 || dif == 200)
				System.out.printf("possible\n");
			else
				System.out.printf("impossible\n");
		}
	}
}
