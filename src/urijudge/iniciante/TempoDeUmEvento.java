package urijudge.iniciante;

import java.util.Scanner;

public class TempoDeUmEvento {

	public static void main(String[] args) {
		String diaInicialTotal, horaInicialTotal, diaFinalTotal, horaFinalTotal;
		int diaInicial, diaFinal, horaInicial, minutoInicial, segundoInicial, horaFinal, minutoFinal, segundoFinal,
				w = 0, x = 0, y = 0, z = 0;
		Scanner read = new Scanner(System.in);

		diaInicialTotal = read.nextLine();
		horaInicialTotal = read.nextLine();
		diaFinalTotal = read.nextLine();
		horaFinalTotal = read.nextLine();

		read.close();

		diaInicial = Integer.parseInt(diaInicialTotal.split(" ")[1]);
		horaInicial = Integer.parseInt(horaInicialTotal.split(":")[0].trim());
		minutoInicial = Integer.parseInt(horaInicialTotal.split(":")[1].trim());
		segundoInicial = Integer.parseInt(horaInicialTotal.split(":")[2].trim());

		diaFinal = Integer.parseInt(diaFinalTotal.split(" ")[1]);
		horaFinal = Integer.parseInt(horaFinalTotal.split(":")[0].trim());
		minutoFinal = Integer.parseInt(horaFinalTotal.split(":")[1].trim());
		segundoFinal = Integer.parseInt(horaFinalTotal.split(":")[2].trim());

		w = diaFinal - diaInicial;

		if (horaInicial < horaFinal) {
			x = horaFinal - horaInicial;
		} else if (horaInicial > horaFinal) {
			x = horaFinal - horaInicial;
			x += 24;
		}

		if (minutoInicial < minutoFinal) {
			y = minutoFinal - minutoInicial;
		} else if (minutoInicial > minutoFinal) {
			y = minutoFinal - minutoInicial;
			y += 60;
		}

		if (segundoInicial < segundoFinal) {
			z = segundoFinal - segundoInicial;
		} else if (segundoInicial > segundoFinal) {
			z = segundoFinal - segundoInicial;
			z += 60;
		}

		if (horaInicial < horaFinal || horaInicial == horaFinal) {
			w += 1;
		}

		if (segundoInicial > segundoFinal) {
			y -= 1;
		}

		if (x < 24) {
			w -= 1;
		}

		if (minutoInicial > minutoFinal) {
			x -= 1;
		}

		System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n", w, x, y, z);

	}

}
