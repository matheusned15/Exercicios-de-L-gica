package br.com.CanalDoCodigo;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double area, raio;
		raio = 5;

		System.out.println("Qual � o raio?");
		raio = sc.nextDouble();

		area = 2 * Math.PI * raio;
		System.out.println("�rea: " + area);
		sc.close();
	}
}
