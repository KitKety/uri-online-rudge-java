package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class P1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(new Locale("US"));
		int positivos=0;
		for(int i=0; i<6;i++) {
			if(sc.nextFloat() > 0) {
				positivos++;
			}
		}
		sc.close();
		System.out.printf(positivos + " valores positivos\n");
	}

}
