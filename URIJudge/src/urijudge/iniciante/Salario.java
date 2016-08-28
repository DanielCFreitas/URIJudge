package urijudge.iniciante;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		int numFuncionario, horasTrabalhadas;
		double valorPorHora, salario;
		Scanner read = new Scanner(System.in);

		numFuncionario = read.nextInt();
		horasTrabalhadas = read.nextInt();
		valorPorHora = read.nextDouble();

		salario = horasTrabalhadas * valorPorHora;

		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numFuncionario, salario);

		read.close();
	}

}
