package iniciante;

import java.util.Scanner;

public class P1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares = 0;
		int positivos = 0;
		int dif=0;
		int aux;
		for (int i = 0; i < 5; i++) {
			aux = sc.nextInt();
			if (aux % 2 == 0)
				pares++;
			if (aux > 0)
				positivos++;
			if(aux ==0)
				dif++;
		}
		sc.close();
		System.out.printf(pares + " valor(es) par(es)\n" + (5 - pares) + " valor(es) impar(es)\n" + positivos
				+ " valor(es) positivo(s)\n" + (5 - positivos - dif) + " valor(es) negativo(s)\n");
	}

}
