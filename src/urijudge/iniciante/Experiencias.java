package urijudge.iniciante;

import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		int N;
		double numCoelho = 0, numRato = 0, numSapo = 0, numeroAtual, total = 0;
		String tipo;
		Scanner read = new Scanner(System.in);

		N = read.nextInt();

		while (N != 0) {
			numeroAtual = read.nextDouble();
			tipo = read.next();
			total += numeroAtual;
			switch (tipo) {
			case "C":
				numCoelho += numeroAtual;
				break;
			case "R":
				numRato += numeroAtual;
				break;
			case "S":
				numSapo += numeroAtual;
				break;
			}
			N--;
		}
		read.close();
		
		System.out.printf("Total: %.0f cobaias\n"+
						  "Total de coelhos: %.0f\n"+
						  "Total de ratos: %.0f\n"+
						  "Total de sapos: %.0f\n"+
						  "Percentual de coelhos: %.2f %%\n"+
						  "Percentual de ratos: %.2f %%\n"+
						  "Percentual de sapos: %.2f %%\n", 
						  total, numCoelho, numRato, numSapo, 
						  (numCoelho/total)*100, (numRato/total)*100, (numSapo/total)*100);
	}

}
