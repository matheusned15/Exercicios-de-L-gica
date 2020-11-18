package br.com.CanalDoCodigo;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int[] v = gerarValor(5);
		System.out.println(Arrays.toString(v));
		bolha(v);
		System.out.println(Arrays.toString(v));
	}

	private static void bolha(int[] v) {

		for (int ultimo = v.length - 1; ultimo > 0; ultimo--) {
			for (int i = 0; i < ultimo; i++) {
				if (v[i] > v[i + 1]) {
					trocar(v, i, i + 1);
				}
			}
		}
	}

	private static void trocar(int[] v, int i, int j) {

		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	public static int[] gerarValor(int n) {
		int[] v = new int[n];
		Random gerador = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = gerador.nextInt(10);

		}
		return v;
	}
}
