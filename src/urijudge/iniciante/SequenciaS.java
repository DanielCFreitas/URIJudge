package urijudge.iniciante;

public class SequenciaS {

	public static void main(String[] args) {
		double cont = 2, soma = 1;

		while (cont <= 100) {
			soma += (1 / cont);
			cont++;
		}

		System.out.printf("%.2f\n", soma);
	}

}
