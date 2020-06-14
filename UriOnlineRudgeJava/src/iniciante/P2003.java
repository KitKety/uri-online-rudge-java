package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class P2003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> horarios = new ArrayList<String>();

		while (sc.hasNext()) {
			horarios.add(sc.next());
		}
		sc.close();
		
		int dif;
		for (String horario : horarios) {
			dif = ((Integer.valueOf(horario.split(":")[0]) - 7) * 60) + Integer.valueOf(horario.split(":")[1]);
			if (dif < 0)
				dif = 0;

			System.out.printf("Atraso maximo: " + dif + "\n");

		}
	}

}
