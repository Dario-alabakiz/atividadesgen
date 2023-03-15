package Atividade;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1,n2,n3,n4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextDouble();
		System.out.println("\nDigite o terceiro número: ");
		n3 = leia.nextDouble();
		System.out.println("\nDigite o quarto número: ");
		n4 = leia.nextDouble();
		
		diferenca = (n1*n2)-(n3*n4);
		
		System.out.printf("\nA diferença é: %.2f",diferenca);
		
		
		
	
		

	}

}
