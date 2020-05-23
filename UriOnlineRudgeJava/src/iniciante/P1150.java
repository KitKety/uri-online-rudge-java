package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1150 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int x = Integer.valueOf(reader.readLine());
		int z;
		do {
			z = Integer.valueOf(reader.readLine());
		} while (z <= x);
		reader.close();

		int soma = x;
		int contador;
		for (contador = 0; soma < z; contador++) {
			soma += x + contador;
		}

		if (x > 0)
			contador++;

		writer.write(contador + "\n");
		writer.flush();

	}

}
