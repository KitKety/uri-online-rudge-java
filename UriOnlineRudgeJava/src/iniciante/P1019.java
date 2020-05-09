package iniciante;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class P1019 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("H:m:s");

		@SuppressWarnings("deprecation")
		String[] tempo = (sd.format(Date.from(Instant.ofEpochSecond(n).plusSeconds(60 * date.getTimezoneOffset()))))
				.split(":", 3);

		int mais = 0;
		while (n > 24 * 60 * 60) {
			n -= 24 * 60 * 60;
			mais++;
		}

		System.out.printf(((Integer.valueOf(tempo[0]) + mais * 24)) + ":" + Integer.valueOf(tempo[1]) + ":"
				+ Integer.valueOf(tempo[2]) + "\n");

	}

}
