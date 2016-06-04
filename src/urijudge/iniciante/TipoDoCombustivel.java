package urijudge.iniciante;

import java.util.Scanner;

public class TipoDoCombustivel {

	public static void main(String[] args) {
		int tipo = 0, alcool = 0, gasolina = 0, diesel = 0;
		Scanner read = new Scanner(System.in);

		while (tipo != 4) {
			tipo = read.nextInt();
			if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			}
		}
		read.close();

		System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);

	}

}
