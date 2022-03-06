package desafio11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TabuleiroSecreto {
	public static void main(String[] args) throws IOException {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

		String entrada = leitor.readLine();
		String[] dados = entrada.split(" ");

		int tamanhoTabuleiro = Integer.parseInt(dados[0]);
		int numOperacoes = Integer.parseInt(dados[1]);

		int[][] mat = new int[tamanhoTabuleiro][tamanhoTabuleiro];

		for (int i = 0; i < tamanhoTabuleiro; i++) {
			for (int y = 0; y < tamanhoTabuleiro; y++) {
				mat[i][y] = 0;
			}
		}
		for (int i = 0; i < numOperacoes; i++) {
			String[] vetorOperacoes = leitor.readLine().split(" ");
			int tipoOperacao = Integer.parseInt(vetorOperacoes[0]);
			int linha = Integer.parseInt(vetorOperacoes[1]);
			int valor = 0;

			if (vetorOperacoes.length == 3) {
				valor = Integer.valueOf(vetorOperacoes[2]);
			}

			switch (tipoOperacao) {
			case 1:
				adicionaLinhaX(linha, valor, mat);
				break;
			case 2:
				adicionaColunaX(linha, valor, mat);
				break;
			case 3:
				exibirLinhaX(linha, mat);
				break;
			case 4:
				exibirColunaX(linha, mat);
				break;
			}
		}

	}

	private static void exibirColunaX(int col, int[][] mat) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(mat[0][col - 1], 1);

		for (int i = 1; i < mat.length; i++) {
			if (map.containsKey(mat[i][col - 1])) {
				map.put(mat[i][col = 1], map.get(mat[i][col - 1]) + 1);
			} else {
				map.put(mat[i][col - 1], 1);
			}
		}

		var chave = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
				.get().getKey();

		if (map.get(chave) == 1) {
			chave = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get()
					.getKey();
		}
		System.out.println(chave);
	}

	private static void exibirLinhaX(int linha, int[][] mat) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(mat[linha - 1][0], 1);

		for (int i = 1; i < mat.length; i++) {
			if (map.containsKey(mat[linha - 1][i])) {
				map.put(mat[linha - 1][i], map.get(mat[linha - 1][i]) + 1);
			} else {
				map.put(mat[linha - 1][i], 1);
			}
		}

		var chave = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
				.get().getKey();

		if (map.get(chave) == 1) {
			chave = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get()
					.getKey();
		}
		System.out.println(chave);
	}

	private static void adicionaColunaX(int coluna, int valor, int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			mat[i][coluna - 1] = valor;
		}
	}

	private static void adicionaLinhaX(int linha, int valor, int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			mat[linha - 1][i] = valor;
		}
	}
}