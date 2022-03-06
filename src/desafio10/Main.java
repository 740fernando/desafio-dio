package desafio10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int b;
		char c;
		int d = 0, e = 0, f = 0, i, t;
		int a = input.nextInt();
		input.nextLine();

		if (a > 0 && a <= 15) {
			for (i = 1; i <= a; i++) {
				String leitor = input.nextLine();
				String[] dados = leitor.split(" ");
				b = Integer.valueOf(dados[0]);
				c = dados[1].toUpperCase().charAt(0);
				switch (c) {
					case 'C':
						d+=b;
						break;
					case 'R':
						e+=b;
						break;
					case 'S':
						f+=b;
						break;
				}
			}
			t = d + e + f;
			System.out.printf("Total : %d cobaias", t);
			System.out.printf("\nTotal de coelhos : %d", d);
			System.out.printf("\nTotal de ratos : %d", e);
			System.out.printf("\nTotal de sapos : %d", f);
			System.out.printf(("\nPercentual de coelhos: %.2f%%"), (d * 100 / (double) t));
			System.out.printf("\nPercentual de ratos: %.2f%% ", ( e * 100 / (double) t));
			System.out.printf("\nPercentual de coelhos: %.2f%% ", ( f * 100 / (double) t));
		}
	}
}
