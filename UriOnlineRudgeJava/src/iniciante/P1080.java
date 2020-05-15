package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i =0 ; i<100; i++) {
			numbers.add(sc.nextInt());
		}
		sc.close();
		@SuppressWarnings("unchecked")
		ArrayList<Integer> copia = (ArrayList<Integer>) numbers.clone();
		numbers.sort(null);
		System.out.printf(numbers.get(99) + "\n" + (copia.indexOf(numbers.get(99))+ 1) + "\n");
	}

}
