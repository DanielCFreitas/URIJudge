package urijudge.iniciante;

import java.util.Scanner;

public class TempoDeJogoComMinutos {

	public static void main(String[] args) {
		int hi, mi, hf, mf, horas, minutos = 0;
		Scanner read = new Scanner(System.in);

		hi = read.nextInt();
		mi = read.nextInt();
		hf = read.nextInt();
		mf = read.nextInt();

		read.close();

		if (hi > hf) {
			horas = (23 - hi) + hf;
		} else if (hf > hi) {
			horas = hf - hi;
		} else {
			horas = 24;
		}

		if (mi > mf) {
			minutos = (60 - mi) + mf;
		} else if (mf > mi) {
			minutos = mf - mi;
		}

		if (hi + 1 == hf) {
			horas -= 1;
		}

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
	}

}
