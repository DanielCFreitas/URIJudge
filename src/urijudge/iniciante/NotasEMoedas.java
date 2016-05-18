package urijudge.iniciante;

import java.util.Scanner;

public class NotasEMoedas {

	public static void main(String[] args) {
		double entrada;
		int nota_100, nota_50, nota_20, nota_10, nota_5, nota_2, moeda_1, moeda_050, moeda_025, moeda_010, moeda_005;
		double moeda_001;
		

		Scanner read = new Scanner(System.in);
		entrada = read.nextDouble();
		read.close();

		nota_100 = (int) (entrada / 100);
		nota_50 = (int) (entrada - (nota_100 * 100)) / 50;
		nota_20 = (int) (entrada - ((nota_100 * 100) + (nota_50 * 50))) / 20;
		nota_10 = (int) (entrada - ((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20))) / 10;
		nota_5 = (int) (entrada - ((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20) + (nota_10 * 10))) / 5;
		nota_2 = (int) (entrada - ((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20) + (nota_10 * 10) + (nota_5 * 5))) / 2;
		moeda_1 =  (int) (entrada - ((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20) + (nota_10 * 10) + (nota_5 * 5) + (nota_2 * 2)));
		moeda_050 = (int) ((entrada - ((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20) + (nota_10 * 10) + (nota_5 * 5) + (nota_2 * 2) + (moeda_1))) / 0.5);
		moeda_025 = (int) ((entrada - ((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20) + (nota_10 * 10) + (nota_5 * 5) + (nota_2 * 2) + (moeda_1) + (moeda_050 * 0.5))) / 0.25);
		moeda_010 = (int) ((entrada - ((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20) + (nota_10 * 10) + (nota_5 * 5) + (nota_2 * 2) + (moeda_1) + (moeda_050 * 0.5) + (moeda_025 * 0.25))) / 0.1);
		moeda_005 = (int) ((entrada - ((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20) + (nota_10 * 10) + (nota_5 * 5) + (nota_2 * 2) + (moeda_1) + (moeda_050 * 0.5) + (moeda_025 * 0.25) + (moeda_010 * 0.1))) / 0.05);		
		moeda_001 =   ((entrada-((nota_100 * 100) + (nota_50 * 50) + (nota_20 * 20) + (nota_10 * 10) + (nota_5 * 5) + (nota_2 * 2) + (moeda_1) + (moeda_050 * 0.5) + (moeda_025 * 0.25) + (moeda_010 * 0.1) +  (moeda_005 * 0.05)))/0.01);

		System.out.printf("NOTAS:\n"+
			"%d nota(s) de R$ 100.00\n"+
			"%d nota(s) de R$ 50.00\n"+
			"%d nota(s) de R$ 20.00\n"+
			"%d nota(s) de R$ 10.00\n"+
			"%d nota(s) de R$ 5.00\n"+
			"%d nota(s) de R$ 2.00\n"+
			"MOEDAS:\n"+
			"%d moeda(s) de R$ 1.00\n"+
			"%d moeda(s) de R$ 0.50\n"+
			"%d moeda(s) de R$ 0.25\n"+
			"%d moeda(s) de R$ 0.10\n"+
			"%d moeda(s) de R$ 0.05\n"+
			"%.0f moeda(s) de R$ 0.01\n", nota_100, nota_50, nota_20, nota_10, nota_5, nota_2, moeda_1, moeda_050, moeda_025, moeda_010, moeda_005, moeda_001);

	}

}
