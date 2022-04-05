package Familia51;

import java.util.Scanner;

public class ExDoWhileQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,somaMulti3=0,conteMulti3=0;
		float media; 
		
		Scanner leia = new Scanner (System.in);
		
		do 
		{
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
			if(numero == 0)
			{
				System.out.println("\nErro!");
			}
			else
			{
				if(numero%3==0)
				{
					somaMulti3+=numero;
					conteMulti3++;
				}
			}
		}
		while(numero!=0);
		media = somaMulti3 / conteMulti3;
		System.out.printf("\nMédia dos números multiplos de 3: %6.2f",media);
	}

}
