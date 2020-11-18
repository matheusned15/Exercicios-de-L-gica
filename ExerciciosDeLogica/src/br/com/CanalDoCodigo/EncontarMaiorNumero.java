package br.com.CanalDoCodigo;

import java.util.Arrays;
import java.util.Random;

public class EncontarMaiorNumero {
	public static void main(String[] args) {

		int[] v = gerarValor(10);
		int idxMaior = buscarMaior(v);
		int idxMenor = buscarMenor(v);
		System.out.println(Arrays.toString(v));
		System.out.println("Maior numero do vetor: " + v[idxMaior]);
		System.out.println("Menor numero do vetor: " + v[idxMenor]);
	}

	private static int buscarMenor(int[] v) {
			int menor = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] < v[menor]) {
				menor = i;
			}
		}
		return menor;
	}

	private static int buscarMaior(int[] v) {
		int maior = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] > v[maior]) {
				maior = i;
			}
		}
		return maior;
	}

	public static int[] gerarValor(int n) {
		int[] v = new int[n];
		Random gerador = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = gerador.nextInt(100);

		}
		return v;
	}
}
