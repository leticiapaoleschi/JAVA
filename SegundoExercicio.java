package Introdução;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		int n1, n2, n3, dias, meses, anos;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("digite sua idade");
		n1=ler.nextInt();
		System.out.print("escreva 365");
		n2=ler.nextInt();
		
		dias = n1*n2;
		
		System.out.print("sua idade em dias é: "+dias);
	    
		System.out.print("digite a quantidade de dias dada anteriormente");
		n1=ler.nextInt();
		System.out.print("digite 365");
		n2=ler.nextInt();
		
		anos= n1/n2;
		
        System.out.print("sua idade em anos é: "+anos);
		
		System.out.print("digite sua idade");
		n3=ler.nextInt();
		System.out.print("digite 12");
		n2=ler.nextInt();
		
		meses= n3*n2;
		
		System.out.print("sua idade em meses é: "+meses);

	}

}
