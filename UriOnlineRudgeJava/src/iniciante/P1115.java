package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P1115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String>results = new ArrayList<String>();
		int x;
		int y;
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x!= 0 && y!=0) {
				if(x>0) {
					if(y>0)
						results.add("primeiro");
					else
						results.add("quarto");
				}else {
					if(y>0)
						results.add("segundo");
					else
						results.add("terceiro");
				}
			}
		}while(x!=0 && y!=0);
		sc.close();
		for(String result:results) {
			System.out.printf(result + "\n");
		}
	}

}
