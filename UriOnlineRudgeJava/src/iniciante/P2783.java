package iniciante;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class P2783 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> markeds = new ArrayList<>();
		HashSet<Integer> purchased = new HashSet<>();
		int total = sc.nextInt();
		int completed = 0;

		int marked = sc.nextInt();
		int acquired = sc.nextInt();
		for (int i = 0; i < marked; i++) {
			markeds.add(sc.nextInt());
		}

		for (int i = 0; i < acquired; i++) {
			purchased.add(sc.nextInt());
		}
		sc.close();

		for (int item : purchased) {
			if (markeds.contains(item)) {
				completed++;
			}
		}

		int result = markeds.size() - completed;

		System.out.println(total < result ? total : result);

	}

}
