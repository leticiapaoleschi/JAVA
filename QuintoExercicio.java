package Introdução;

import java.util.Scanner;

public class QuintoExercicio {
   
	public static void main(String[] args) {
	    int A, B, C, R, S, D, R1, R2, R3;
        Scanner ler = new Scanner(System.in);
		
		System.out.print("digite um valor");
		R1=ler.nextInt();
		System.out.print("digite outro valor");
		R2=ler.nextInt();
		
		A= R1*R1;
		B= R2*R2;
		R= A+B;
		
		System.out.print(R);
		
		System.out.print("digite um valor");
		R2=ler.nextInt();
		System.out.print("digite outro valor");
		R3=ler.nextInt();
		
		B= R2*R2;
		C= R3*R3;
		S= C+B;
		
		System.out.print(S);
		
		System.out.print("digite o resultado de R");
		R=ler.nextInt();
		System.out.print("digite o resultado de S");
		S=ler.nextInt();
		
		D= R+S/2;
		
		System.out.print(D);
		
		
		
		
		
		
		
		
	}

}
