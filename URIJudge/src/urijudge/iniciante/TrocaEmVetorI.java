package urijudge.iniciante;

import java.util.Scanner;

public class TrocaEmVetorI {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Integer[] numero = new Integer[20];
		int auxiliar;

		for (int i = 0; i < 20; i++) {
			numero[i] = read.nextInt();
		}

		for (int i = 0, x = 19; i < 10; i++, x--) {
			auxiliar = numero[i];
			numero[i] = numero[x];
			numero[x] = auxiliar;
		}

		for (int i = 0; i < 20; i++) {
			System.out.printf("N[%d] = %d\n", i, numero[i]);
		}

		read.close();
	}
}
