package br.com.CanalDoCodigo;

import java.util.Scanner;

public class ConversaoMetragem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double metro, kilometro, milimetro;
		System.out.println("Insira a quantidade de metros");
		metro = sc.nextDouble();
		kilometro = metro / 1000;
		milimetro = metro * 1000;
		System.out.println("Kilometro: " + kilometro);
		System.out.println("Milimetro: " + milimetro);

	}
}
