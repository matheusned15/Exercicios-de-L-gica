package br.com.CanalDoCodigo;

import java.util.Arrays;
import java.util.Random;

public class OrdenacaoPorInsercao {

	public static void main(String[] args) {
		int[] v = gerarValor(5);
		insertionSort(v);
		System.out.println(Arrays.toString(v));
	}

	public static int[] gerarValor(int n) {
		int[] v = new int[n];
		Random gerador = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = gerador.nextInt(10);

		}
		return v;
	}

	private static void insertionSort(int[] v) {
		int x, j;
		for (int i = 1; i < v.length; i++) {
			x = v[i];
			j = i - 1;
			while ((j >= 0) && v[j] > x) {
				v[j + 1] = v[j];
				j = j - 1;
			}
			v[j + 1] = x;
		}

	}
}
