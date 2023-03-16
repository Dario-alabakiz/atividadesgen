package LaçoCondiconalif;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int n1;
		
		
		System.out.println("\nDigite um número:  ");
		n1 = leia.nextInt();
		
		
		if(n1 % 2 == 0 && n1 > 0){
			System.out.println("\n O número "+n1+" é par e positivo");
		}
		else if(n1 % 2 != 0 && n1 < 0) {
			System.out.println("\n O número "+n1+" é impar e negativo");
		}
		else if(n1 % 2 != 0 && n1 > 0) {
			System.out.println("\n O número "+n1+" é impar e positivo");
		}
		else if(n1 % 2 == 0 && n1 < 0) { 
			System.out.println("\n O número "+n1+" é par e negativo");
		}
			else {
				System.out.println("\nO número "+n1+" é zero e par");
			}
	}
}


