package ExercicioCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercList1 {
	        //Coreslista.add(Azul);
			//Coreslista.add(Verde);
			//Coreslista.add(Amarelo);
			//Coreslista.add(Branco);
			//Coreslista.add(Laranja);
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<String> Coreslista = new ArrayList<String>();
		int op;
		
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("\n\t\tMenu de Cores");
			System.out.println("-----------------------------------------------------");
			System.out.println("\n(1)Deseja adicionar uma cor?");
			System.out.println("\n(2)Deseja remover uma cor?");
			System.out.println("\n(3)Deseja mostrar o Menu de cor(es)?");
			System.out.println("\n(0)Deseja sair do Menu de cores?");
			op = leia.nextInt();
			
			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome da cor para adicionar ao Menu: ");
				String cor = leia.nextLine();
				Coreslista.add(cor);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque:");
				String cores = leia.nextLine();
				if(Coreslista.contains(cores)) {
					Coreslista.remove(cores);
				}else {
					System.out.println("\nEsta cor não existe!!!");
				}
				System.out.println("\nCOres do Menu:  ");
				System.out.println(Coreslista);
				break;
				
			case 3:
				System.out.println("\nMenu de cores:  ");
				System.out.println(Coreslista);
				break;
				
			case 0:
				
				System.out.println("\nMuito obrigado por utilizar o nosso sistema volte sempre :)");
				break;
				
				default:
					System.out.println("\nOpção invalida!!!...Digite novamente: ");
			}
			
		}while(op !=0);
		
		 System.out.println("\nCores do Menu De Cores ");
		 for(int i=0;i<Coreslista.size();i++) {
	        	System.out.println("\nCores: "+Coreslista.get(i));
	        }
	        Collections.sort(Coreslista);
	       
	        System.out.println("\nCores organizadas em ordem alfabetica: ");
	        System.out.println(Coreslista);
	        
	        System.out.println();
		
	        Iterator<String> icoreslista = Coreslista.iterator();
	      
	        while(icoreslista.hasNext()) {
	        	 
	        	
	        	System.out.println(icoreslista.next());
	        }

}}
