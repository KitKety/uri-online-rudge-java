package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1960 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		br.close();

		StringBuffer n2 = new StringBuffer();
		StringBuffer roman = new StringBuffer();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int a = 0; a < 10; a++) {
			n2.replace(0, n2.length(), String.valueOf(n - a));
			if (n2.charAt(n2.length() - 1) == '0') {
				if (a < 3) {
					for (int b = 0; b < a; b++) {
						roman.append("I");
					}
				} else if (a < 6) {
					if (a < 4)
						roman.append("I");
					else
						roman.append("V");
					for (int b = 0; b < 5 - a; b++) {
						roman.append("I");
					}

				} else if (a < 9) {
					for (int b = 0; b < a - 5; b++) {
						roman.append("I");
					}
					roman.append("V");

				} else
					roman.append("XI");
				n -= a;
				break;
			}
		}

		if (n > 0) {
			for (int a = 0; a < 91; a += 10) {
				if (n - a == 0 || n - a == 100 || n - a == 200 || n - a == 300 || n - a == 400 || n - a == 500
						|| n - a == 600 || n - a == 700 || n - a == 800 || n - a == 900) {
					if (a < 31) {
						for (int b = 0; b < a / 10; b++) {
							roman.append("X");
						}
					} else if (a < 50)
						roman.append("LX");
					else if (a < 81) {
						n -= 50;
						a -= 50;
						for (int b = 0; b < a; b += 10) {
							roman.append("X");
						}
						roman.append("L");
					} else
						roman.append("CX");

					n -= a;
					break;
				}
			}
		}

		if (n > 0) {
			for (int a = 0; a < 901; a += 100) {
				if (n - a == 0) {
					if (a < 500) {
						if (a < 301) {
							for (int b = 0; b < a / 100; b++) {
								roman.append("C");
							}
						} else {
							roman.append("D");
							for (int b = 0; b < 5 - a / 100; b++) {
								roman.append("C");
							}
						}
					} else if (a < 801) {
						a -= 500;
						for (int b = 0; b < a / 100; b++) {
							roman.append("C");
						}
						roman.append("D");
					} else
						roman.append("MC");

					break;
				}
			}
		}

		bw.write(roman.reverse().toString() + "\n");
		bw.flush();
	}

}
