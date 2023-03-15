package Atividade;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salariobruto,adicionalnoturno,horasextras,descontos,salarioliquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu salário bruto: ");
		salariobruto = leia.nextDouble();
		System.out.println("\nDigite seu Adicional Noturno: ");
		adicionalnoturno = leia.nextDouble();
		System.out.println("\nDigite suas Horas Extras: ");
		horasextras = leia.nextDouble();
		System.out.println("\nDigite seus Descontos: ");
		descontos = leia.nextDouble();
		
	    salarioliquido = (salariobruto+adicionalnoturno+(horasextras*5)-descontos);
	    
			
		System.out.printf("\nSeu Salário Liquído é de: R$ %.2f",salarioliquido);
		

	}

	private static double adicionalnoturno(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
