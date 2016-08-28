package urijudge.iniciante;

import java.util.Scanner;

public class AumentoDeSalario {

	public static void main(String[] args) {
		double salario;
		Scanner read = new Scanner(System.in);

		salario = read.nextDouble();

		read.close();

		if (salario > 0 && salario <= 400) {
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 0.15));
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.15);
			System.out.printf("Em percentual: 15 %%\n");
		} else if (salario > 400 && salario <= 800) {
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 0.12));
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.12);
			System.out.printf("Em percentual: 12 %%\n");
		} else if (salario > 800 && salario <= 1200) {
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 0.10));
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.10);
			System.out.printf("Em percentual: 10 %%\n");
		} else if (salario > 1200 && salario <= 2000) {
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 0.07));
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.07);
			System.out.printf("Em percentual: 7 %%\n");
		} else if (salario > 2000){
			System.out.printf("Novo salario: %.2f\n", salario + (salario * 0.04));
			System.out.printf("Reajuste ganho: %.2f\n", salario * 0.04);
			System.out.printf("Em percentual: 4 %%\n");			
		}
	}

}
