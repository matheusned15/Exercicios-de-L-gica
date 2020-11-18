package br.com.CanalDoCodigo;

import java.util.Scanner;

public class TiposTriangulo {
	public static void main(String[] args) {

		double a, b, c;
		double aux, a2, bc;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de a:");
		a = sc.nextDouble();
		System.out.println("Digite o valor de b:");
		b = sc.nextDouble();
		System.out.println("Digite o valor de c:");
		c = sc.nextDouble();

		if (b > a) {
			aux = a;
			a = b;
			b = aux;
		}

		if (c > a) {
			aux = a;
			a = c;
			c = aux;
		}

		a2 = Math.pow(a, 2);
		bc = Math.pow(b, 2) + Math.pow(c, 2);

		if (a >= b + c) {
			System.out.println("Não forma triangulo");
		} else {
			if (a2 > bc) {
				System.out.println("Triangulo obtusangulo");
			} else if (a2 < bc) {
				System.out.println("Triangulo acutangulo");
			} else {
				System.out.println("Triangulo retangulo");
			}

			if (a == b && b == c) {
				System.out.println("Triangulo equilatéro");
			} else if (a == b || a == c || b == c) {
				System.out.println("Triango isoceles");
			}
		}
	}
}
