package urijudge.iniciante;

import java.util.Scanner;

public class SeisNumerosImpares {

	public static void main(String[] args) {
		int valor, cont = 0;
		Scanner read = new Scanner(System.in);

		valor = read.nextInt();
		while (cont <= 5) {
			if (valor % 2 != 0) {
				System.out.printf("%d\n", valor);
				valor += 1;
				cont += 1;
			} else {
				valor += 1;
			}
		}

		read.close();

	}

}
