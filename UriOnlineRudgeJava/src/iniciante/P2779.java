package iniciante;

import java.util.HashSet;
import java.util.Scanner;

public class P2779 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hashset = new HashSet<>();
		
		int total = sc.nextInt();
		int cases = sc.nextInt();
		
		for (int i = 0; i < cases; i++) {
			hashset.add(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(total - hashset.size());
	}

}
