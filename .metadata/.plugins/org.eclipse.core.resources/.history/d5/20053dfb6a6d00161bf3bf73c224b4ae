package urijudge.iniciante;

import java.util.Scanner;

public class ParesImparesPositivosENegativos {

	public static void main(String[] args) {
		int valor, cont = 0, pares = 0, impares = 0, positivos = 0, negativos = 0;
		Scanner read = new Scanner(System.in);

		while (cont < 5) {
			valor = read.nextInt();
			if (valor % 2 == 0) {
				pares += 1;
			} else {
				impares += 1;
			}

			if (valor > 0) {
				positivos += 1;
			} else if (valor < 0) {
				negativos += 1;
			}
			cont += 1;
		}
		read.close();

		System.out.printf(
				"%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",
				pares, impares, positivos, negativos);

	}

}
