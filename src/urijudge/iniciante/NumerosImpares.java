package urijudge.iniciante;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		int valor, cont = 0;
		Scanner read = new Scanner(System.in);
		valor = read.nextInt();

		while (cont <= valor) {
			if (cont % 2 != 0) {
				System.out.printf("%d\n", cont);
			}
			cont += 1;
		}
		read.close();
	}

}
