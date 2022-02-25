package Introdução;

import java.util.Scanner;

public class OitavoExercicio {

	public static void main(String[] args) {
		double carro, impostos;
		Scanner ler = new Scanner(System.in);
		System.out.print("digite o valor do carro");
		carro=ler.nextDouble();
		
		impostos= carro+carro*0.28+carro*0.45;
		System.out.print(impostos);
		
		
		

	}

}
