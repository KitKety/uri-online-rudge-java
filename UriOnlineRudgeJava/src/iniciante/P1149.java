package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1149 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] line = reader.readLine().split(" ");
		reader.close();
		int a = Integer.valueOf(line[0]);
		int n = Integer.valueOf(line[line.length - 1]);

		int soma = 0;
		for (int i = 0; i < n; i++) {
			soma += a + i;
		}

		writer.write(soma + "\n");
		writer.flush();
	}

}
