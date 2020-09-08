package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class P1263 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> alliterations;
		int alliteration;
		String s;
		
		while (sc.hasNext()) {
			alliterations = new ArrayList<>();
			alliteration = 0;
			s = "";
			String[] line = sc.nextLine().split(" ");
			
			for (String word : line) {
				if (String.valueOf(word.charAt(0)).equalsIgnoreCase(s) && alliterations.size() > 0
						&& !alliterations.get(alliterations.size() - 1).equalsIgnoreCase(s)) {
					alliteration++;
					alliterations.add(s);
				} else {
					alliterations.add(s);
					s = String.valueOf(word.charAt(0));
				}
			}
			
			System.out.printf("%d\n", alliteration);
		}
		
		sc.close();
	}

}
