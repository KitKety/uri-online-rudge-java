package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class P1277 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {
			int students = sc.nextInt();
			ArrayList<String> studentsArray = new ArrayList<>();
			ArrayList<String> reprovedArray = new ArrayList<>();

			for (int a = 0; a < students; a++) {
				studentsArray.add(sc.next());
			}

			for (String student : studentsArray) {
				String presence = sc.next().replaceAll("M", "");
				double presences = 0.0;
				for (char c : presence.toCharArray()) {
					if (c == 'P') {
						presences++;
					}
				}
				
				if (presences / presence.length() < 0.75) {
					reprovedArray.add(student);
				}
			}

			for (int b = 0; b < reprovedArray.size(); b++) {
				System.out.printf(reprovedArray.get(b));
				if (b < reprovedArray.size() - 1) {
					System.out.printf(" ");
				}
			}
			
			System.out.println();
		}

		sc.close();
	}

}
