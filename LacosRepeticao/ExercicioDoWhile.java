package LacosRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n=0,quantidade=0;
		
	
		
		do {
			
			System.out.println("\nDigite o número desejado:  ");
			n = leia.nextFloat();
			
			if(n >= 0) {
				
			
			      quantidade += n;                                  
				
				
				
			
			}
			System.out.printf("\nA soma dos números positivos é: %.0f",quantidade);
		}while(n !=0 );
		
	}}		
	



//System.out.println("\nDigite o número desejado:  ");
//n1 = leia.nextFloat();