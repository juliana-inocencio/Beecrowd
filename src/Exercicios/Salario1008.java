package Exercicios;

import java.util.Scanner;

public class Salario1008 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
				
		int numero = leia.nextInt();
		int horasTrabalhadas = leia.nextInt();
		double valorHorasTrabalhadas = leia.nextDouble();
	
		double salario = horasTrabalhadas*valorHorasTrabalhadas;
		
		System.out.println("NUMBER = "+numero);
		System.out.println(String.format("SALARY = U$ %.2f",salario));
		
	}

}
