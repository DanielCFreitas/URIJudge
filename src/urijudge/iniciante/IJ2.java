package urijudge.iniciante;

public class IJ2 {

	public static void main(String[] args) {
		for (int i = 1, j = 7; i < 10; i += 2) {
			System.out.printf("I=%d J=%d\n", i, j);
			System.out.printf("I=%d J=%d\n", i, j-1);
			System.out.printf("I=%d J=%d\n", i, j-2);
		}
	}

}
