package br.com.CanalDoCodigo;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args) {
		int anos, meses, dias;
		int idadeEmDias;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade em anos:");
		anos = sc.nextInt();
		System.out.println("Digite a idade em meses:");
		meses = sc.nextInt();
		System.out.println("Digite a idade em dias:");
		dias = sc.nextInt();
		idadeEmDias = anos * 365 + meses * 30 + dias;
		System.out.println("Idade em dias: " + idadeEmDias);
	}
}
