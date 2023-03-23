package ExercCollection2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercFila {

	public static void main(String[] args) {
		
       Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		int op;
		
		do {
		
		System.out.println("\n\n");
		System.out.println("------------------------------------------------------------");
		System.out.println("\t\t BANCO GEN ");
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\t (1) ADICIONAR CLIENTE NA FILA  ");
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\t (2) LISTA DE TODOS OS CLIENTES");
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\t (3) RETIRE CLIENTE DA FILA  ");
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\t (0) SAIR ");
		System.out.println("------------------------------------------------------------");
		System.out.println("\nDIgite o número desejado:  ");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			leia.nextLine();
			System.out.println("\n\nDigite seu nome:  ");
			String nome = leia.nextLine();
			fila.add(nome);
			break;
			
		case 2:
			boolean C = fila.isEmpty();
			if(C) {
				System.out.println("\n\nNão existe cliente na fila!!!");
			}else {
			System.out.println("\n\nListar todos os Clientes"+fila);
			}
			break;
		case 3:
			boolean R = fila.isEmpty();
			if(R) {
				System.out.println("\n\nNão existe cliente na fila!!!");
			}else {
			leia.nextLine();
			System.out.println("\n\nDigite o nome que deseja retirar: ");
			String remover = leia.nextLine();
			fila.remove(remover);
			}
			break;
			
		case 0:
			System.out.println("\n\nAtenção você está saindo do app de visualização de clientes!!!!!");

			break;
			
		default:
			System.out.println("\nOpção Inválida!\n");
				break;
		}
		
	
			
		}while(op !=0);
		
	//default:
	//	System.out.println("\nOpção Inválida!\n");
		//break;

	}

}
