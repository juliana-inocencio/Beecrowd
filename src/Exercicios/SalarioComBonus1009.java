package Exercicios;

import java.util.Scanner;

public class SalarioComBonus1009 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner (System.in);
		
		String nome = leia.next();
		double salarioFixo = leia.nextDouble();
		double vendas = leia.nextDouble();
		
		double total = (0.15*vendas)+salarioFixo;
		
		System.out.println(String.format("TOTAL = R$ %.2f",total));
		
	}

}
