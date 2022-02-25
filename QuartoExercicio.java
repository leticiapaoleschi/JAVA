package Introdução;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		double A, B, mediaPonderada, r1= 2, r2= 5;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("escreva a primeira nota");
		A=ler.nextInt();
		System.out.print("escreva a segunda nota");
		B= ler.nextInt();
		
		mediaPonderada= A*r1+B*r2/7;
		
		
		System.out.print(mediaPonderada);
		
		
	
		
		
		

	}

}
