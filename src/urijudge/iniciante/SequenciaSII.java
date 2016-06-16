package urijudge.iniciante;

public class SequenciaSII {

	public static void main(String[] args) {
		double n1 = 3, n2 = 2, soma = 1;

		while (n1 != 39) {
			soma += n1 / n2;
			n1 += 2;
			n2 += n2;
		}
		System.out.printf("%.2f\n", soma);
	}

}
