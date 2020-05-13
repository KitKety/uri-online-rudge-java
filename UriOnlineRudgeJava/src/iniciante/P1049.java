package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class P1049 {
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String p1 = sc.next().trim();
		String p2 = sc.next().trim();
		String p3 = sc.next().trim();
		sc.close();
		String animal;

		if (p1.equals("vertebrado")) {
			if (p2.equals("ave")) {
				if (p3.equals("carnivoro"))
					animal = "aguia";
				else
					animal = "pomba";
			} else {
				if (p3.equals("onivoro"))
					animal = "homem";
				else
					animal = "vaca";
			}
		} else {
			if (p2.equals("inseto")) {
				if (p3.equals("hematofago"))
					animal = "pulga";
				else
					animal = "lagarta";
			} else {
				if (p3.equals("hematofago"))
					animal = "sanguessuga";
				else
					animal = "minhoca";
			}
		}

		System.out.printf(animal + "\n");

	}

}
