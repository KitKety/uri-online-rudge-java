package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1132 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[2];
		numbers[0] = Integer.valueOf(br.readLine());
		numbers[1] = Integer.valueOf(br.readLine());
		br.close();

		Arrays.sort(numbers);
		int soma = 0;
		for (int i = numbers[0]; i <= numbers[1]; i++) {
			if (i % 13 != 0)
				soma += i;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(soma + "\n");
		bw.flush();
	}

}
