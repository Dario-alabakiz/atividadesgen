package ExercicioArray;

import java.util.Scanner;

public class ExerVetor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int[]{2,5,1,3,4,9,7,8,10,6};
		int nv,x,cont=0;
		
		System.out.println("Digite o número que deseja encontrar:  ");
		nv = leia.nextInt();
		
		for(x=0;x<=9;x++) {
			
			if(vetor[x] == nv) {
				System.out.println("\nO número está na posição: "+x);
				cont++;	
			}
		}
		if(cont == 0) {
			System.out.println("\nNão foi encontrado!!!!!");
		}
	}

}
