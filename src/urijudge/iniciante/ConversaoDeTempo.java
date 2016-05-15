package urijudge.iniciante;

import java.util.Scanner;

public class ConversaoDeTempo {
	public static void main(String[] args) {
		int tempo, horas, minutos, segundos;
		Scanner read = new Scanner(System.in);

		tempo = read.nextInt();

		read.close();

		horas = tempo / 3600;
		minutos = (tempo - (horas * 3600)) / 60;
		segundos = tempo - (horas * 3600 + minutos * 60);

		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
	}
}
