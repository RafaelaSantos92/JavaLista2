package Familia51;

import java.util.Scanner;

public class ExDoWhileQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,somaNumero=0;
				Scanner leia = new Scanner (System.in);
				
		do
		{
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
			somaNumero+=numero;
		}
		while (numero != 0);
		System.out.println("\nA soma dos números digitados é: "+somaNumero);
		
		
		
	}
}
