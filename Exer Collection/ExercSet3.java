package ExercicioCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercSet3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 Set<Integer> num = new HashSet<Integer>();
		 
		 int n;
		 
		 for(int x=0;x<10;x++) {
		 System.out.println("\nDigite o número desejado:  ");
		 n = leia.nextInt();
		 num.add(n);
		 }
		 System.out.println("\n\tLista de números!!!!");
		 
	     Iterator<Integer> iNum = num.iterator();
		 
	     while(iNum.hasNext()) {
        	 
	        	
	        	System.out.println(iNum.next());
	        }
				 
				 

	}

}
