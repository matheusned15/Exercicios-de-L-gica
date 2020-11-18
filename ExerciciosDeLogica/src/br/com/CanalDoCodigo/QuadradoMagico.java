package br.com.CanalDoCodigo;

public class QuadradoMagico {

	public static boolean quadradoMagico(int[][] matriz) {
		int soma = 0;
		int soma2 = 0;

		// Somar elementos d primeira linha
		for (int j = 0; j < matriz.length; j++) {
			soma = soma + matriz[0][j];
		}
		// Somar as demais linhas
		for (int i = 1; i < matriz.length; i++) {
			soma2 = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				soma2 = soma2 + matriz[i][j];
			}
			if (soma2 != soma) {
				return false; // Não é quadrado magico
			}
		}

		// Somar as colunas
		for (int j = 0; j < matriz[0].length; j++) {
			soma2 = 0;
			for (int i = 0; i < matriz.length; i++) {
				soma2 = soma2 + matriz[i][j];
			}
			if (soma2 != soma) {
				return false;
			}
		}
		soma2 = 0;
		// Somar a diagonal principal
		for (int i = 0; i < matriz.length; i++) {
			soma2 = soma2 + matriz[i][i];
		}
		if (soma2 != soma) {
			return false;
		}

		// Somar a diagonal secundaria
		soma2 = 0;
		int i = 0;
		for (int j = matriz.length - 1; j >= 0; j--) {
			soma2 = soma2 + matriz[i][j];
			i++;
		}
		if (soma2 != soma) {
			return false;
		}
		return true; //É quadrado magico
	}

	public static void main(String[] args) {
		int [][]matriz = new int [3][3];
		matriz[0][0] = 3;
		matriz[0][1] = 4;
		matriz[0][2] = 8;
		matriz[1][0] = 10;
		matriz[1][1] = 5;
		matriz[1][2] = 0;
		matriz[2][0] = 2;
		matriz[2][1] = 6;
		matriz[2][2] = 99;
		if(quadradoMagico(matriz)) {
			System.out.println("Matriz é quadrado magico");
		} else {
			System.out.println("Não é quadrado magico");
		}


	}
}
