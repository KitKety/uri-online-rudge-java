package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1146 {

	public static void main(String[] args) throws IOException {
		StringBuilder results = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(reader.readLine());
		while (n != 0) {
			for (int i = 1; i < n; i++) {
				results.append(i + " ");
			}
			results.append(n + "\n");
			n = Integer.valueOf(reader.readLine());
		}
		writer.write(results.toString());
		writer.flush();
	}

}
