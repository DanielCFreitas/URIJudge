package urijudge.iniciante;

import java.util.Scanner;

public class Grenais {

	public static void main(String[] args) {
		int inter, gremio, continuar = 1, vitoriaInter = 0, vitoriaGremio = 0, empate = 0, totalDeJogos = 0;
		Scanner read = new Scanner(System.in);

		while (continuar == 1) {
			totalDeJogos += 1;
			inter = read.nextInt();
			gremio = read.nextInt();
			if (inter > gremio) {
				vitoriaInter += 1;
			} else if (inter < gremio) {
				vitoriaGremio += 1;
			} else {
				empate += 1;
			}
			System.out.printf("Novo grenal (1-sim 2-nao)\n");
			continuar = read.nextInt();
		}

		System.out.printf("%d grenais\n", totalDeJogos);
		System.out.printf("Inter:%d\n", vitoriaInter);
		System.out.printf("Gremio:%d\n", vitoriaGremio);
		System.out.printf("Empates:%d\n", empate);
		if (vitoriaInter > vitoriaGremio)
			System.out.printf("Inter venceu mais\n");
		else if (vitoriaInter < vitoriaGremio)
			System.out.printf("Gremio venceu mais\n");
		else
			System.out.printf("Nao houve vencedor\n");
		read.close();
	}

}
