package urijudge.iniciante;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		double valor;
		Scanner read = new Scanner(System.in);

		valor = read.nextDouble();

		read.close();
		
		if(valor < 0 || valor > 100){
			System.out.printf("Fora de intervalo\n");
		} else if (valor <= 25){
			System.out.printf("Intervalo [0,25]\n");
		} else if (valor <= 50){
			System.out.printf("Intervalo (25,50]\n");
		} else if (valor<=75){
			System.out.printf("Intervalo (50,75]\n");
		} else {
			System.out.printf("Intervalo (75,100]\n");
		}
	}

}
