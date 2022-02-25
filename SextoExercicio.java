package Introdução;

import java.util.Scanner;

public class SextoExercicio {

	public static void main(String[] args) {
		double x1, x2, y1, y2, r, raiz;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("escreva os valores do primeiro plano x1: ");
		x1=ler.nextDouble();
		System.out.print("escreva os valores do primeiro plano y1: ");
		y1=ler.nextDouble();
		System.out.print("escreva os valores do primeiro plano x2: ");
		x2=ler.nextDouble();
		System.out.print("escreva os valores do primeiro plano y2: ");
		y2=ler.nextDouble();
		
		
		r= Math.pow((x1-x2),2)+ Math.pow((y1-y2),2);
		raiz= Math.sqrt(r);
		
		System.out.print(raiz);
		

	}

}
