package LaçoCondicionalSwitch;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int op;	
		double valortotal,quantidade;
		
		
		
		
		System.out.println("\n\t\tMenu dos produtos");
		System.out.println("\n1  Cachorro Quente  R$ 10,00");
		System.out.println("\n2 X-Salada  R$ 15,00");
		System.out.println("\n3 X-Bacon  R$ 18,00");
		System.out.println("\n4 Bauru  R$ 12,00");
		System.out.println("\n5 Refrigerenta  R$ 8,00");
		System.out.println("\n6 Suco de Laranja  R$ 13,00");
		System.out.println("\n\nDigite o número do produto desejado:");
		
		op = leia.nextInt();
			
		//System.out.println("\n\nDigite a Quantidade:");
		
		switch(op) {
		
		case 1:
			double preço1 = 10.00;
			System.out.println("\nCachorro Quente" );
			System.out.printf("\n\nDigite a quantidade:");
			quantidade = leia.nextDouble();
			valortotal = (quantidade*preço1);
			System.out.printf("\nO valor total foi de: R$ %.2f",valortotal);
			break;
			
		case 2:
			double preço2 = 15.00;
			System.out.println("\nX-Salada");
			System.out.printf("\n\nDigite a quantidade:");
			quantidade = leia.nextDouble();
			valortotal = (quantidade*preço2);
			System.out.printf("\nO valor total foi de: R$ %.2f",valortotal);
			break;
			
		case 3:
			double preço3 = 18.00;
			System.out.println("\nX-Bacon");
			System.out.printf("\n\nDigite a quantidade:");
			quantidade = leia.nextDouble();
			valortotal = (quantidade*preço3);
			System.out.printf("\nO valor total foi de: R$ %.2f",valortotal);
			break;
			
		case 4:
			double preço4 = 12.00;
			System.out.println("\nBauru");
			System.out.printf("\n\nDigite a quantidade:");
			quantidade = leia.nextDouble();
			valortotal = (quantidade*preço4);
			System.out.printf("\nO valor total foi de: R$ %.2f",valortotal);
			break;
			
		case 5:
			double preço5 = 8.00;
			System.out.println("\nRefrigerenta");
			System.out.printf("\n\nDigite a quantidade:");
			quantidade = leia.nextDouble();
			valortotal = (quantidade*preço5);
			System.out.printf("\nO valor total foi de: R$ %.2f",valortotal);
			break;
			
		case 6:
			double preço6= 13.00;
			System.out.println("\nSuco de Laranja");
			System.out.printf("\n\nDigite a quantidade:");
			quantidade = leia.nextDouble();
			valortotal = (quantidade*preço6);
			System.out.printf("\nO valor total foi de: R$ %.2f",valortotal);
			break;
			
		default:
			System.out.println("\nOpção inválida!!!");
			
				
			}
		
			
	
		}
	}



//Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item 
//(número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
//A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.

//Código do Produto     Produto       Preço Unitário
//1                  Cachorro Quente   R$ 10.00
//2                  X-Salada          R$ 15.00
//3                  X-Bacon           R$ 18.00
//4                  Bauru             R$ 12.00
//5                  Refrigerante      R$ 8.00
//6                  Suco de laranja   R$ 13.00

//Valor total = quantidade * preço

