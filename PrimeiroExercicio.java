package Introdução;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		int N1, N2, N3, dias, anos, meses;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("digite sua idade");
		N1=ler.nextInt();
		System.out.print("escreva 12");
		N2=ler.nextInt();
		
		meses= N1*N2;
		
		System.out.print("sua idade em meses é: "+meses);
		
		System.out.print("digite a quantidade de meses dada anteriormente");
		N1=ler.nextInt();
		System.out.print("digite 12");
		N2=ler.nextInt();
		
		anos= N1/N2;
		
		System.out.print("sua idade em dias é: "+anos);
		
		System.out.print("digite sua idade");
		N3=ler.nextInt();
		System.out.print("digite 365");
		N2=ler.nextInt();
		
		dias= N3*N2;
		
		System.out.print("sua idade em dias é: "+dias);
				
		
		
		
		

	}

}
