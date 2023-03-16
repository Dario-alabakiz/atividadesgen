package LaçoCondicionalSwitch;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		 
		float n1,n2;
		int op;
		
		System.out.println("\n\t\tCódigo    Operações");
		System.out.println("\n                   1         Soma");
		System.out.println("\n                   2         Subtração");
		System.out.println("\n                   3         Multiplacação");
		System.out.println("\n                   4         Divisão");
		System.out.println("\n\nDigite o número do código desejado: ");
		
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			float soma;
			System.out.println("\nDigite o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número: ");
			n2 = leia.nextInt();
			
			soma = (n1+n2);
			System.out.printf("\nO resultado é: %.0f",soma);
            
			break;
			
		case 2:
			float subtração;
			System.out.println("\nDigite o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número: ");
			n2 = leia.nextInt();
			
			subtração = (n1-n2);
			System.out.printf("\nO resultado é: %.0f",subtração);
			break;
			
		case 3:
			float multiplicação;
			System.out.println("\nDigite o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número: ");
			n2 = leia.nextInt();
			
			multiplicação = (n1*n2);
			System.out.printf("\nO resultado é: %.0f",multiplicação);
			break;
			
		case 4:
			float divisão;
			System.out.println("\nDigite o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número: ");
			n2 = leia.nextInt();
			
			divisão = (n1/n2);
			System.out.printf("\nO resultado é: %.0f",divisão);
			break;
			
		default:
			System.out.println("\nOpção inválida!!!");
		}
		
		
	
		
		

	}

}


//Código    Operação
//  1       Soma
//  2       Subtração
//  3       Multiplicação
//  4       Divisão

