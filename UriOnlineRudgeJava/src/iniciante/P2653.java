package iniciante;

import java.util.HashSet;
import java.util.Scanner;

public class P2653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> jewels = new HashSet<>();

		while (sc.hasNext()) {
			jewels.add(sc.next());
		}
		sc.close();
		System.out.println(jewels.size());
	}

}
