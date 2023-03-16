package LaçoCondiconalif;

import java.util.Scanner;

public class exercicio1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float A,B,C;
		
		System.out.println("\nEntre com o valor de A: ");
		A = leia.nextFloat();
		System.out.println("\nEntre com o valor de B: ");
		B = leia.nextFloat();
		System.out.println("\nEntre com o valor de C: ");
		C = leia.nextFloat();
		
		if(A+B > C) {
			System.out.println("\nA soma de A+B é maior que C!!!");
		}
		else if(A+B < C) {
			System.out.println("\nA soma de A+B é menor que C!!! ");
		}
		else {System.out.println("\nA soma de A+B é igual a C!!!");
	}
		

}
}


     