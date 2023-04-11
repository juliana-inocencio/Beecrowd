package Exercicios;

import java.util.Scanner;

public class Media1006 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double a = leia.nextDouble();
		double b = leia.nextDouble();
		double c = leia.nextDouble();
		
		double media = ((2 * a) + (3 * b) + (5 * c))/10;
		
		System.out.println(String.format("MEDIA = %.1f",media));

	}

}
