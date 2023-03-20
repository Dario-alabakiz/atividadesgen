package ExercicioArray;

import java.util.Scanner;

public class ExercMatriz3{

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] N = new int [3][3];
		int[] DP = new int [3];
		int[] DS = new int [3];
		int x,L,C,somaDP=0,somaDS=0;
		
	for(L=0;L<3;L++) {
	    for(C=0;C<3;C++) {
	        System.out.println("\nEntre com os valores da Matriz:  ");
	           N[L][C] = leia.nextInt();
	}} 

	for(L=0;L<3;L++) {
	    for(C=0;C<3;C++) {
	        if(L == C) {
	
	      somaDP += N[L][C];
	      DP[L] = N[L][C];
	}}}
	
	
	for(L=0;L<3;L++) {
		for(C=0;C<3;C++) {
			if(L + C == N.length -1) {
			
			DS[L] = N[L][C];
			somaDS += N[L][C];
			
			
		}}}
	System.out.println("\nAs diagonias principal são:  ");
	
	for(x = 0;x<DP.length;x++) {
		System.out.println(DP[x]+" ");
	}
	
	System.out.println("\nAs diagonais secundarias são:  ");
	
	for(x = 0;x<DP.length;x++) {
		System.out.println(DS[x]+" ");
	}
	
	System.out.println("\nA soma das diagonal pricipal é de: "+somaDP);
	System.out.println("\nA soma das diagonal secundaria é de: "+somaDS);
	
	
	
	
				
	
		
	



}}