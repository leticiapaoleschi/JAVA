package Introdução;

import java.util.Scanner;

public class SetimoExercicio {

	public static void main(String[] args) {
		double x, y, a, b, c, d, e, f;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("escreva os valor de a: ");
		a=ler.nextDouble();
		System.out.print("escreva os valores do primeiro plano b: ");
		b=ler.nextDouble();
		System.out.print("escreva os valores do primeiro plano c: ");
		c=ler.nextDouble();
		System.out.print("escreva os valores do primeiro plano d: ");
		d=ler.nextDouble();
		System.out.print("escreva os valores do primeiro plano e: ");
		e=ler.nextDouble();
		System.out.print("escreva os valores do primeiro plano f: ");
		f=ler.nextDouble();
		
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		
		System.out.print(x);
		System.out.print(y);
	}

}
