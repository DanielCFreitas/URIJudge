package urijudge.iniciante;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;
		Scanner read = new Scanner(System.in);

		palavra1 = read.nextLine();
		palavra2 = read.nextLine();
		palavra3 = read.nextLine();

		read.close();

		switch (palavra1) {
		case "vertebrado":
			switch (palavra2) {
			case "ave":
				switch (palavra3) {
				case "carnivoro":
					System.out.printf("aguia\n");
					break;
				case "onivoro":
					System.out.printf("pomba\n");
					break;
				}
				break;
			case "mamifero":
				switch (palavra3) {
				case "onivoro":
					System.out.printf("homem\n");
					break;
				case "herbivoro":
					System.out.printf("vaca\n");
					break;
				}
				break;
			}
			break;
		case "invertebrado":
			switch (palavra2) {
			case "inseto":
				switch (palavra3) {
				case "hematofago":
					System.out.printf("pulga\n");
					break;
				case "herbivoro":
					System.out.printf("lagarta\n");
					break;
				}
				break;

			case "anelideo":
				switch (palavra3) {
				case "hematofago":
					System.out.printf("sanguessuga\n");
					break;
				case "onivoro":
					System.out.printf("minhoca\n");
					break;
				}
				break;
			}
			break;
		}

	}

}
