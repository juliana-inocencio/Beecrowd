package Exercicios;

import java.util.Scanner;


public class AreaDoCírculo1002 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double a = leia.nextDouble();
		double area = 3.14159 * Math.pow(a, 2);
		System.out.println(String.format("A=%.4f", area)); //opção1 - correta 
		//System.out.printf("A=%.4f\n",area);//opção2 - errada, eu fiz dessa forma
		
	}

}
