package Familia51;

import java.util.Scanner;

public class ExForQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num,somaPar=0,somaImpar=0,x;
			Scanner leia = new Scanner (System.in);
			
			for(x=1;x<=10;x++)
			{			
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			
				if(x%2==0)
				{
					
					somaPar++;
				}
				else
				{
					
					somaImpar++;
				}
								
			
			}
			
			System.out.println("\nDos números digitados "+somaPar+ " são pares e "+somaImpar+ " são ímpares.");
			
				
	}

}
