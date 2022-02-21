package desafio8;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DIO {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		Double x = leitor.nextDouble();
		String s = String.format("%.4E", x);
		if (String.valueOf(s).startsWith("-")) {
			System.out.printf("%.4E", x);
		} else {
			System.out.printf("+%.4E", x);
		}
	}
}
