package desafio5;

import java.io.IOException;
import java.util.Scanner;

public class DIO {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();

		double porcetagem = 0.00;

		if ((A > 0.00) && (B >= A) && (B <= 1000.0)) {

			double result = (B * 100) / A;
			porcetagem = result - 100;
		}
		
		System.out.printf("Resultado : %.2f%%", porcetagem);
	}
}
