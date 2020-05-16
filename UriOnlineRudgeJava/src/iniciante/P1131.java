package iniciante;

import java.util.Scanner;

public class P1131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gremio, inter;
		int vG = 0, vI = 0;
		int empates = 0;
		int execucoes = 0;
		do {
			inter = sc.nextInt();
			gremio = sc.nextInt();
			if (inter > gremio)
				vI++;
			else if (gremio > inter)
				vG++;
			else
				empates++;
			execucoes++;
		} while (sc.nextInt() == 1);
		sc.close();
		for (int i = 0; i < execucoes; i++) {
			System.out.printf("Novo grenal (1-sim 2-nao)\n");
		}
		System.out.printf(execucoes + " grenais\nInter:" + vI + "\nGremio:" + vG + "\nEmpates:" + empates + "\n");
		System.out.printf(
				(vI > vG) ? "Inter venceu mais\n" : ((vI == vG) ? "Nao houve vencedor\n" : "Gremio venceu mais\n"));

	}

}
