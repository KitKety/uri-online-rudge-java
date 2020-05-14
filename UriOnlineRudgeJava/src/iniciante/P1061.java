package iniciante;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class P1061 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Calendar c1 = Calendar.getInstance(Locale.ROOT);
		Calendar c2 = Calendar.getInstance(Locale.ROOT);
		SimpleDateFormat sd = new SimpleDateFormat("dd:HH:mm:ss");
		Date date = new Date();

		int d1 = Integer.valueOf(sc.nextLine().replace("Dia ", "").trim());
		String t1 = sc.nextLine();
		int d2 = Integer.valueOf(sc.nextLine().replace("Dia ", "").trim());
		String t2 = sc.nextLine();

		sc.close();

		int h1 = Integer.valueOf(t1.split(":", 3)[0].trim());
		int m1 = Integer.valueOf(t1.split(":", 3)[1].trim());
		int s1 = Integer.valueOf(t1.split(":", 3)[2].trim());
		int h2 = Integer.valueOf(t2.split(":", 3)[0].trim());
		int m2 = Integer.valueOf(t2.split(":", 3)[1].trim());
		int s2 = Integer.valueOf(t2.split(":", 3)[2].trim());

		c1.set(1970, 0, d1, h1, m1, s1);
		c2.set(1970, 0, d2, h2, m2, s2);

		@SuppressWarnings("deprecation")
		int utc = date.getTimezoneOffset();

		Instant diferenca = c2.toInstant().minusMillis(c1.getTimeInMillis())
				.plusSeconds(60*(utc));
				
		String s = sd.format(Date.from(diferenca));

		System.out.printf(Integer.valueOf(s.split(":", 4)[0].trim())-1 + " dia(s)\n");
		System.out.printf(Integer.valueOf(s.split(":", 4)[1].trim()) + " hora(s)\n");
		System.out.printf(Integer.valueOf(s.split(":", 4)[2].trim()) + " minuto(s)\n");
		System.out.printf(Integer.valueOf(s.split(":", 4)[3].trim()) + " segundo(s)\n");
	}

}
