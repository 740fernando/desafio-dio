package desafio2;
import java.io.IOException;
import java.util.Scanner;

/**
 * Crie um programa que leia um n�mero e mostre os n�meros pares at� esse
 * n�mero, ] inclusive ele mesmo.
 * 
 * @author Fernando
 *
 */
public class Program {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}

	}
}
