package Introdução;

import java.util.Scanner;

public class TerceiroExerciciojava {

	public static void main(String[] args) {
		int h1, s1, m1, minutos, segundos, horas;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("digite o tempo de duração");
		h1=ler.nextInt();
		System.out.print("escreva 60");
		m1=ler.nextInt();
		
		minutos= h1*m1;
		
		System.out.print("o tempo de duração do evento em minutos é: "+minutos);
		
		System.out.print("digite o tempo de duração em minutos dado acima ");
		m1=ler.nextInt();
		System.out.print("escreva 60");
		s1=ler.nextInt();
		
		segundos= s1*m1;
		
		System.out.print("o tempo de duração do evento em segundos é: "+segundos);
		
		System.out.print("digite o tempo de duração em segundos dado acima");
		s1=ler.nextInt();
		System.out.print("escreva 3600");
		h1=ler.nextInt();
        
		horas= s1/h1;
		
		System.out.print("o tempo de duração do evento em segundos é: "+horas);
	}

}
