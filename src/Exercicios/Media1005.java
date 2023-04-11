package Exercicios;

import java.util.Scanner;

public class Media1005 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a = leia.nextDouble();
		double b = leia.nextDouble();
		
		double media = ((3.5 * a) + (7.5 * b))/11;
		
		System.out.println(String.format("MEDIA = %.5f",media));
		
		
	}

}
