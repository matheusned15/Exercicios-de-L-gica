package br.com.CanalDoCodigo;

import java.util.Scanner;

public class FibonacciRecursivo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite a quantidade de numeros da sequencia");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println(fibonacci(i));
		}
	}

	 static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
