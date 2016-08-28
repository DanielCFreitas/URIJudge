package urijudge.iniciante;

import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		int codigo, quantidade;
		double total = 0.0;
		Scanner read = new Scanner(System.in);

		codigo = read.nextInt();
		quantidade = read.nextInt();

		read.close();

		switch (codigo) {
		case 1:
			total = 4.00 * quantidade;
			break;
		case 2:
			total = 4.50 * quantidade;
			break;
		case 3:
			total = 5.00 * quantidade;
			break;
		case 4:
			total = 2.00 * quantidade;
			break;
		case 5:
			total = 1.50 * quantidade;
			break;
		}

		System.out.printf("Total: R$ %.2f\n", total);
	}

}
