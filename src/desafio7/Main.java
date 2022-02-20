package desafio7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double N;
		int quociente, resto, nota, moeda;

		N = sc.nextDouble();

		if((N>=0)&&(N<=1000000.00)){
			
			resto = (int) (N * 100.0 + 0.5);
			
			System.out.println("NOTAS:");
			
			nota = 100;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
			resto = resto % (nota * 100);
			
			nota = 50;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
			resto = resto % (nota * 100);
			
			nota = 20;
			quociente = resto / (nota * 100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
			resto = resto % (nota * 100);
			
			nota = 10;
			quociente = resto / (nota*100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
			resto = resto % (nota * 100);
			
			nota = 5;
			quociente = resto/(nota*100);
			System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
			resto = resto % (nota * 100);
			
			nota = 2;
			quociente =resto/(nota*100);
			System.out.println(quociente+" nota(s) de R$ "+ nota + ".00");
			resto = resto % (nota * 100);
			
			System.out.println("MOEDAS:");
			
			moeda = 100;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 1.00");
			resto = resto % moeda;
			
			moeda = 50;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 0.50");
			resto = resto % moeda;
			
			moeda = 25;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 0.25");
			resto = resto % moeda;
			
			moeda = 10;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 0.10");
			resto = resto % moeda;
			
			moeda = 5;
			quociente = resto / moeda;
			System.out.println(quociente + " moeda(s) de R$ 0.05");
			resto = resto % moeda;
			
			// continue o seu c�digo aqui
			
			System.out.println(resto + " moeda(s) de R$ 0.01");
		}

		sc.close();
	}
}
