package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2for {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float total=0,contPar=0,contImpar=0;
		
		int n,x;
		
		 for(x=1;x<=10;x++) {
		System.out.println("\nEntre com um número :  ");
		n = leia.nextInt();
		
		if(n %2 == 0) {
			contPar ++;                                         
			n++;
		}else {
			contImpar ++;
			n++;
		}
		
		 }
		 System.out.println("\nA quantidade de numeros par é de:  "+contPar);
			System.out.println("\nA quantidade de numeros ímpares é de:  "+contImpar);
	}
}
