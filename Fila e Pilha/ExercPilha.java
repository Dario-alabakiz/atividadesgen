package ExercCollection2;

import java.util.Scanner;
import java.util.Stack;

public class ExercPilha {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 Stack<String> pilha = new Stack<String>();
			
		
		int op;
		
		do {
		
		System.out.println("\n\n");
		System.out.println("------------------------------------------------------------");
		System.out.println("\t\t LIVROS ");
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\t (1) ADICIONAR LIVRO NA PILHA");
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\t (2) LISTAR TODOS OS LIVROS DA PILHA");
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\t (3) RETIRE LIVRO DA PILHA");
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\t (0) SAIR");
		System.out.println("------------------------------------------------------------");
		System.out.println("\nDIgite o número desejado:  ");
		op = leia.nextInt();
		
		
		switch (op) {
		
		case 1:
			leia.nextLine();
			System.out.println("\n\nEscreva o nome do livro que deseja adicionar:");
			String nome = leia.nextLine();
			pilha.add(nome);
			break;
		case 2:
			boolean L = pilha.isEmpty();
			if(L) {
				System.out.println("\n\nPilha de livros está vazia!!!");
			}else {
			System.out.println("\n\nListar todos os livros da pilha"+pilha);
			}
			break;
		case 3:
			boolean R = pilha.isEmpty();
			if(R) {
				System.out.println("\n\nPilha de livros está vazia!!!");
			}else {
			leia.nextLine();
			System.out.println("\n\nRetirar o livro da Pilha");
			String remover = leia.nextLine();
			pilha.remove(remover);
			}
			break;
		case 0:
			System.out.println("\n\nAtenção você está saindo do app de visualização da pilha de Livros");

			break;
			
		default:
			System.out.println("\nOpção Inválida!\n");
				break;
		
		}
		}while(op != 0);

	}

}
