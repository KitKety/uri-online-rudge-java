package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P2702 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int chicken = sc.nextInt();
		int meat = sc.nextInt();
		int pasta = sc.nextInt();
		int requisitedChicken = sc.nextInt();
		int requisitedMeat = sc.nextInt();
		int requisitedPasta = sc.nextInt();
		sc.close();

		int exclude = 0;

		if (chicken - requisitedChicken < 0) {
			exclude += requisitedChicken - chicken;
		}
		if (meat - requisitedMeat < 0) {
			exclude += requisitedMeat - meat;
		}
		if (pasta - requisitedPasta < 0) {
			exclude += requisitedPasta - pasta;
		}

		System.out.printf("%d\n", exclude);
	}

}
