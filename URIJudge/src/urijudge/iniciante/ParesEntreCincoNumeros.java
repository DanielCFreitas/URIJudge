package urijudge.iniciante;

import java.util.Scanner;

public class ParesEntreCincoNumeros {

	public static void main(String[] args) {
		int valor, cont = 0;
		Scanner read = new Scanner(System.in);

		for (int x = 0; x < 5; x++) {
			valor = read.nextInt();
			if (valor % 2 == 0) {
				cont += 1;
			}
		}
		read.close();

		System.out.printf("%d valores pares\n", cont);
	}

}
