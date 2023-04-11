package Exercicios;

import java.util.Scanner;

public class CalculoSomples1010 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int codigoPeca1 = leia.nextInt(); 
		int quantidadePeca1 = leia.nextInt();
		double valorPeca1 = leia.nextDouble();
		
		int codigoPeca2 = leia.nextInt(); 
		int quantidadePeca2 = leia.nextInt();
		double valorPeca2 = leia.nextDouble();
		
		double total = (quantidadePeca1*valorPeca1)+(quantidadePeca2*valorPeca2);
		
		System.out.printf(String.format("VALOR A PAGAR: R$ %.2f\n",total));
	

	}

}
