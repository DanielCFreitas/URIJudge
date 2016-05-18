package urijudge.iniciante;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		int dia, anos, meses, dias;
		Scanner read = new Scanner(System.in);

		dia = read.nextInt();

		read.close();

		anos = dia / 365;
		meses = (dia - (365 * anos)) / 30;
		dias = dia - ((anos * 365) + (meses * 30));

		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);

	}

}
