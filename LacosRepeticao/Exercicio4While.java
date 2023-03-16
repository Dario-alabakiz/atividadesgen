package LacosRepeticao;

import java.util.Scanner;

public class Exercicio4While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float idade,menores=0,maiores=0;
		
		System.out.println("\nEntre com a sua idade :  ");
		idade = leia.nextFloat();
		
		while(idade >=0) {
		
		if(idade <=21) {
			menores ++;                                         
			
		}else if(idade >= 50)
			maiores ++;
			
			System.out.println("\nEntre com a sua idade, caso tenha terminado digite (-1) sair do programa:");
			idade = leia.nextFloat();
		}
		 System.out.printf("\nA quantidade de menores é de:  %.0f",menores);
			System.out.printf("\nA quantidade de maiores é de:  %.0f",maiores);
		//80,15,20,13,5,52,33,26,71,18
	}}
